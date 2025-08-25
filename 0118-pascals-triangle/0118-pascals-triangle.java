import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li2 = new ArrayList<>();

        if (numRows <= 0) return li2; 

        for (int i = 0; i < numRows; i++) {
            List<Integer> li = new ArrayList<>(); 
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    li.add(1); 
                } else {
                    int a = li2.get(i - 1).get(j - 1);
                    int b = li2.get(i - 1).get(j);
                    li.add(a + b); 
                }
            }
            
            li2.add(li);
        }
        return li2;
    }
}
import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> li = new ArrayList<>();
        long ans = 1;   // use long to avoid overflow for big rows
        li.add((int) ans);

        for (int i = 1; i <= rowIndex; i++) {
            ans = ans * (rowIndex - i + 1) / i;
            li.add((int) ans);
        }
        return li;
    }
}


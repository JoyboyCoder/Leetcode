

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li2 = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            
        List<Integer> li = new ArrayList<>();
        long ans = 1;   // use long to avoid overflow for big rows
        li.add((int) ans); 
        for (int j = 1; j <=i; j++) {
            ans = ans * (i - j+1) / j;
            li.add((int) ans);
             }
             li2.add(li);
        }
        return li2;
    }
}
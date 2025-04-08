class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int [] arr :accounts){
            int add = 0;
            for(int i :arr) add += i;
            if(add > ans) ans =add;
        }
        return ans;
    }
}
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int sum=0;
        //repeated
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }
                sum += grid[i][j];
            }
        }

        //missing
        int n = grid.length;
        sum = sum - ans[0];
        int orgSum = (n * n * (n * n + 1)) / 2; 

        int missing = orgSum - sum;
        ans[1] = missing;

        return ans; 

    }
}
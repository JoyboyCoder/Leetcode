class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for(int i:nums){
            if(i != min && i != max) return i;
        }
        return -1;

    }
}
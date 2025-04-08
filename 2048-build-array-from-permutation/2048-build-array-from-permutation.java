class Solution {
    public int[] buildArray(int[] nums) {
        trans(nums, 0);
        return nums;
    }
    
    private void trans(int[] nums, int i) {
        if(i<nums.length) {
           int value = nums[nums[i]];
           trans(nums, i+1);
           nums[i]=value;
        }
    }
}
class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i:nums){
            if(i==nums[0] || i==nums[nums.length - 1]) n--;
        }
        return n;
    }
}
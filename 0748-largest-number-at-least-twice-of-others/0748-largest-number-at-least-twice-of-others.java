class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;  // If only one element, return index 0

        int maxIndex = 0, max = nums[0], secondMax = Integer.MIN_VALUE;

        // Find max and second max
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return (max >= 2 * secondMax) ? maxIndex : -1;
    }
}

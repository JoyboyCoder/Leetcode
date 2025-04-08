class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) return -1;
        int a = nums[0], b = nums[1], c = nums[2];
        if ((a > b && a < c) || (a > c && a < b)) return a;
        if ((b > a && b < c) || (b > c && b < a)) return b;
        if ((c > a && c < b) || (c > b && c < a)) return c;
        return nums[1]; 
    }
}
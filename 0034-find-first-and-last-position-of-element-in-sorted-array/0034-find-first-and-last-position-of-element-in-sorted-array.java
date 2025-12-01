class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // First occurrence
        ans[0] = binarySearch(nums, target, true);
        // Last occurrence
        ans[1] = binarySearch(nums, target, false);

        return ans;
    }

    // Helper method to find first or last position
    static int binarySearch(int[] nums, int target, boolean findFirst) {
        int s = 0, e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                ans = mid;
                // If finding first, shrink end to search left side
                if (findFirst) {
                    e = mid - 1;
                } 
                // If finding last, move start to search right side
                else {
                    s = mid + 1;
                }
            }
        }

        return ans;
    }
}
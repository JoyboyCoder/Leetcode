import java.util.*;

class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        // Initialize map with 0 sum having 1 count
        mpp.put(0, 1);

        for (int i = 0; i < n; i++) {
            preSum += arr[i];

            // Subarray with sum k ends here if (preSum - k) exists
            int remove = preSum - k;
            cnt += mpp.getOrDefault(remove, 0);

            // Update prefix sum frequency
             
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}

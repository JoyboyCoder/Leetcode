import java.util.*;

class Solution {

    private long calculateTotalHours(int[] piles, int speed) {
        long totalH = 0L;
        for (int bananas : piles) {
            // do the integer ceil in long to avoid overflow
            totalH += ((long)bananas + speed - 1) / speed;
            // early stop if already too large (optional but a nice optimization)
            if (totalH > Integer.MAX_VALUE && totalH > (long)1_000_000_000L) {
                // no need to keep exact if it's already huge relative to expected h
                // but not required; you can remove this block if you prefer exact sums
            }
        }
        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int p : piles) maxPile = Math.max(maxPile, p);

        int low = 1, high = maxPile;
        int ans = maxPile;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalH = calculateTotalHours(piles, mid);

            if (totalH <= (long) h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

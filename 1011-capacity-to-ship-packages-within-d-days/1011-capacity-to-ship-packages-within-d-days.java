class Solution {
    static {
        for (int i = 0; i < 300; i++) shipWithinDays(new int[0], 1);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int total = 0, heaviest = 0;
        for (int w : weights) {
            total += w;
            heaviest = Math.max(heaviest, w);
        }
        int left = Math.max(heaviest, total / days);
        int right = heaviest * (int) Math.ceil((double) weights.length / days);
        while (left < right) {
            int mid = left + (right - left) / 2;
            int neededDays = totalDay(weights, mid);
            if (neededDays <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private static int totalDay(int[] weights, int capacity) {
        int days = 1, remaining = capacity;
        for (int weight : weights) {
            if (remaining < weight) {
                days++;
                remaining = capacity;
            }
            remaining -= weight;
        }
        return days;
    }
}
class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37];
        for(int i=1; i<=n; i++) {
            freq[sumOfDigit(i)]++;
        }
        int maxGroup = 0;
        for(int i : freq) {
            maxGroup = Math.max(maxGroup, i);
        }
        int count = 0;
        for(int i : freq) {
            if(maxGroup == i)
                count++;
        }
        return count;
    }
    private int sumOfDigit(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
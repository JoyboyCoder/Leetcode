class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int[] count = new int[101];
        for (int i: nums){
            count[i]++;
        }
        for(int i =count.length-1 ;i>0 ;i--){
            if(count[i] == 1){
                sum = sum +i;
            }
        }
        return sum;
    }
}
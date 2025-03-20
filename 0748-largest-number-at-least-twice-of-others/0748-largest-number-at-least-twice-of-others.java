class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length<1) return -1;
        int arr[]= nums.clone();
        Arrays.sort(nums);
        int a=nums[nums.length-2]*2;
        int b = nums[nums.length-1];
        int c=-1;
        if(a<=b){
            c= findIndex(arr,b);
        }
        return c;
    }
    public int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
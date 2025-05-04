class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length+nums2.length;
        int[] arr = new int[l];
        int i=0;
        for(int j:nums1){
            arr[i++]=j;
        }
         for(int j:nums2){
            arr[i++]=j;
        }
        Arrays.sort(arr);
        int x =l/2;
        if(l%2!=0){
            return (double)arr[x];
        }
        else{
            double ans = (arr[x]+arr[x-1])/2.0;
            return ans;
        }
    
    }

}
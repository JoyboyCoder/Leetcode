class Solution {
    static boolean checkDivisor(int[] arr,int divisor,int th){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= (arr[i]+divisor-1)/divisor;
        }
        if (sum<=th) return true;
        else return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {

        int left=1;
        int right=0;
        for(int x:nums){
            right=Math.max(x,right);
        }

        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(checkDivisor(nums,mid,threshold)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return ans;
    }
}
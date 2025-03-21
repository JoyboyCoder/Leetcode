class Solution {
    public int thirdMax(int[] nums) {
        long fir = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long thi = Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
           if(nums[i]==fir||nums[i]==sec||nums[i]==thi){
            continue;
           }
           if(fir<nums[i]){
            thi=sec;
            sec=fir;
            fir=nums[i];
           }
           else if(sec<nums[i]){
            thi=sec;
            sec=nums[i];
           }
           else if(thi<nums[i]){
            thi=nums[i];
           }
        }
        return thi == Long.MIN_VALUE ? (int) fir : (int) thi;
  }         
}
class Solution {
    public int findNumbers(int[] nums) {
        //String arr[] = new String[nums.length];
        int ans=0;
        for(int i:nums){
            int n=0;
            while(i>0){
                n++;
                i/=10;
            }
            if(n%2==0) ans++;
        }
        // n=0;
        // for(String s:arr){
        //     if(s.length() % 2 == 0){
        //         n++;
        //     }
        // }
        return ans;
        
  }
}
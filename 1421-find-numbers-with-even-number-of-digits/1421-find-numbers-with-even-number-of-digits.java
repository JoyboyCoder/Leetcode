class Solution {
    public int findNumbers(int[] nums) {
        String arr[] = new String[nums.length];
        int n=0;
        for(int i:nums){
            arr[n++] = String.valueOf(i);
        }
        n=0;
        for(String s:arr){
            if(s.length() % 2 == 0){
                n++;
            }
        }
        return n;
  }
}
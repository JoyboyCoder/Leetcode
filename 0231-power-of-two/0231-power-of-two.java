class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n>0){
             if(n%2==0){
                n/=2;
              }
              else{
                break;
              }
        }
        return n==1;
           
        
    }
}
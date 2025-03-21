class Solution {
    public int addDigits(int num) {
        int n=num;
      while(n>=10){
         int rem=0;
        while(n>0){
             rem+=n%10;
             n/=10;
        }
        n=rem;
      }
        return n;
    }
}
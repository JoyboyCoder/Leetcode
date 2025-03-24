class Solution {
    public boolean isUgly(int n) {
        int flag=0;
        if(n>0){
            while(n%2==0){
                n/=2;
            }
            while(n%3==0){
                n/=3;
            }
            while(n%5==0){
                n/=5;
            }
            return n==1;
        }
        else if(n==1){
            return true;
        }
        else {
            return false;
        }
    }
}
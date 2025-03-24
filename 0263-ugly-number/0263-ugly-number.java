class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int m=n;
        while(m>5){
            if(m%2==0){
                m=m/2;
            }
            else if(m%3==0){
                m=m/3;
            }
            else if(m%5==0){
                m=m/5;
            }
            else{
                 return false;   
            }
        }   
        return true;     
    }
}
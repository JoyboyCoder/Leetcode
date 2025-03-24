class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int m=n;
        int i=0;
        while(m>5){
            if(m%2==0){
                m=m/2;
                i++;
            }
            else if(m%3==0){
                m=m/3;
                i++;
            }
            else if(m%5==0){
                m=m/5;
                i++;
            }
            else{
                 return false;   
            }
        }   
        return true;     
    }
}
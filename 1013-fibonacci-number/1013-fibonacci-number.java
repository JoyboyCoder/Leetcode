class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int f1=0;
        int f2=1;
        int sum=0;
        int i=1;
        while(i<n){
            sum=f1+f2;
            f1=f2;
            f2=sum;
            i++;

        }
        return sum;
        
    }
}
class Solution {
    public int reverse(int x) {
        long rev=0;
        int temp=x;
        

        while(temp>0||temp<0){
            rev = rev*10+temp%10;
            temp/=10;
        }
        if (rev<Integer.MIN_VALUE||rev>Integer.MAX_VALUE||x==0){
            return 0;
        }
        else{
            return (int)rev;    
        }
    }
}
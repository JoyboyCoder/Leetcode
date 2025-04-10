class Solution {
    public int lengthOfLastWord(String s) {
        String ss =" ";
        int n=s.length()-1;
        int ans = 0;
        int i=n;
        while (i>=0){
            if (s.charAt(i)==ss.charAt(0)){
                i--;
            }
            else{
                break;
            }
        }
        while(i>=0){
            if (s.charAt(i)==ss.charAt(0)){
                break;
            }
            else{
                i--;
                ans++;
            }
        }
        
        return ans;
    }
}
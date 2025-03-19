class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str1="";
        Arrays.sort(strs);
        String first = strs[0];
        String second = strs[strs.length-1];
        for(int i =0;i<first.length();i++){
            if(first.charAt(i)==second.charAt(i)){
                str1 = str1+first.charAt(i);
            }
            else{
                break;
            }
        }
        
        return str1;

        
    }
}
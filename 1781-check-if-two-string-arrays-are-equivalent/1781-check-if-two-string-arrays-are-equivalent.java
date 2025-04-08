class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 ="";
        String w2 ="";
        for(String wo1 : word1) w1=w1+wo1;
        for(String wo2 : word2) w2=w2+wo2;
        if(w1.length() !=w2.length()) return false;   
        for(int i=0;i<w1.length();i++){
            if(w1.charAt(i) != w2.charAt(i)) return false;
        }
        return true;
    }
}
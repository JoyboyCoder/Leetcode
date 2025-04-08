class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 ="";
        String w2 ="";
        for(String wo1 : word1) w1=w1+wo1;
        for(String wo2 : word2) w2=w2+wo2;
        return w1.equals(w2);
    }
}
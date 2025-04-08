class Solution {
    public String truncateSentence(String s, int k) {
        String[] word=s.split(" ");
        String[] ans=Arrays.copyOfRange(word,0,k);
        return String.join(" ",ans);
    }
}
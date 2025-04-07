class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar = (int)(target - 1) + 1;
        for(int i =0;i<letters.length;i++){
            int var = (int) (letters[i]-1) + 1;
            if(var>tar){
                return letters[i];
            }
        }
        return letters[0];
    }
}
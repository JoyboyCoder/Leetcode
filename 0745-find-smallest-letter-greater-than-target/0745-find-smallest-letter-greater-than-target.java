class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar = (int)target;
        for(char letter:letters){
            int var = (int)letter;
            if(var>tar){
                return letter;
            }
        }
        return letters[0];
    }
}
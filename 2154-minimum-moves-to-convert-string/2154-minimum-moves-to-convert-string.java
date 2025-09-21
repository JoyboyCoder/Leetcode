class Solution {
    public int minimumMoves(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; ) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 3; // one move converts s[i], s[i+1], s[i+2] to 'O'
            } else {
                i++;
            }
        }
        return count;
    }
}

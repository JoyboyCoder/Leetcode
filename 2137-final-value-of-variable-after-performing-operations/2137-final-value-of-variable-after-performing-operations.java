class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(String ch:operations){
            if( ch.charAt(1) == '+') count++;
            else count--;
        }
        return count;
    }
}
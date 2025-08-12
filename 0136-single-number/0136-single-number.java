class Solution {
    public int singleNumber(int[] nums) {
        int uniqueno=0;
		for(int i:nums){
		    uniqueno=uniqueno^i;
		}
        return uniqueno;
        
    }
}
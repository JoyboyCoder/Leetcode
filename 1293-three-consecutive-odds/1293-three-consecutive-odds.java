class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length < 3) return false;
        int j=0;
        for(int i:arr){
            if(i%2 !=0){
                j++;
                if(j==3){
                    return true;
                }
            }
            else{
                j=0;
            }
            
        }
        return false;
    }
}
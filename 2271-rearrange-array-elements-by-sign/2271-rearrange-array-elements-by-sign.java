// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int [] ar =new int[nums.length];
//         int positive = 0;
//         int negative = 1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] > 0){

//                 ar[positive] = nums[i];
//                 positive += 2;
//             } else {
//                 ar[negative] = nums[i];
//                 negative += 2;
//             }
//         }
//         return ar ;
//     }
// }










class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] l = new int[nums.length];
        int positive = 0;
        int negative = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                l[positive] = nums[i];
                positive += 2;
            } else {
                l[negative] = nums[i];
                negative += 2;
            }
        }
        return l;
    }
}
        
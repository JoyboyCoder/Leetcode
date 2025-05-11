/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let leftPointer = 0;
    let rightPointer = 1;
    let dupeCount = 0;
    if (nums.length <= 1 ){
        return nums.length;
    }
    while (rightPointer < nums.length) {
        let positionVal = nums[leftPointer]
        let checkVal = nums[rightPointer]
        if (positionVal === checkVal) {
            rightPointer++;
            dupeCount++;
        } else {
            nums[leftPointer + 1] = nums[rightPointer];
            rightPointer++;
            leftPointer++;
        }
    }

    return nums.length - dupeCount
};
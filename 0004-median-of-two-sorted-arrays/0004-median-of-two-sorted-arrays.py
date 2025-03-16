class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1+=nums2
        nums1.sort()
        a=int(len(nums1)/2)
        if len(nums1)%2==0:
            return((nums1[a]+nums1[a-1])/2)
        else:
            return(float(nums1[a]))
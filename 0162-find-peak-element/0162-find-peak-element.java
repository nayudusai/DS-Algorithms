class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length,index=0;
        int peakElement=nums[0];
        for(int i=0;i<n;i++) {
            if(nums[i] > peakElement) {
                peakElement = nums[i];
                index=i;
            }
        }
        return index;
    }
}
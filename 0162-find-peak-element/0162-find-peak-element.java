class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length-1;
        int peakElement=nums[0];
        int start=1,end=n-1;
        if(nums[0] == nums[n] && nums.length == 1) {
            return 0;
        }
        if(nums[0] > nums[1]) {
            return 0;
        }
        if(nums[n-1] > nums[n]) {
            return n-1;
        }
        while(start <= end) {
            int mid=start + (end-start)/2;
            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) {
                return mid-1;
            }
            if(nums[mid-1] < nums[mid]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
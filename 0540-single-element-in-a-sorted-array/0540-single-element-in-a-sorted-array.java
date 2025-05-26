class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length-1;
        int start=1,end=n-1;
        if(nums[0] == nums[n]) {
            return nums[0];
        }
        if(nums[0] != nums[start]) {
            return nums[start-1];
        }
        if(nums[n-1] != nums[n]) {
            return nums[n];
        }
        while(start<=end) {
            // if(nums[start-1] != nums[start]) {
            //     return nums[start-1];
            // }
            // if(nums[n-1] != nums[n]) {
            //     return nums[n];
            // }
            int mid=start +(end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
                return nums[mid];
            }
            if(mid%2==0) {
                if(nums[mid] == nums[mid-1]) {
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            else {
                if(nums[mid] == nums[mid-1]) {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
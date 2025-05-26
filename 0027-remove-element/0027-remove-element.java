class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length-1;
        int count=0;
        int left=0, right=n;
        while(left <= right) {
            if(nums[right] == val) {
                right--;
                count++;
            }else if(nums[left] == val) {
                int temp=0;
                temp=nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
                count++;
            }
            else {
                left++;
            }
        }
        return nums.length-count;
    }
}
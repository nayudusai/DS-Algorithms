class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length-1;
        int i=0;
        for(int j=1;j<=n;j++) {
            if(nums[i]!=0 && i<n) {
                i++;
            }
            else if(nums[i] == 0 && nums[j]!=0) {
                int temp=0;
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
    }
}
class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++) {
            if(nums[0] == nums[2]) {
                return "equilateral";
            }
            else if(nums[0] + nums[1] <= nums[2]) {
                return "none";
            }
            else if (nums[0] == nums[1] || nums[1] == nums[2]) {
                return "isosceles";
            }
        }
        return "scalene";

    }
}
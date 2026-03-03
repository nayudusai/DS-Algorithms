class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);;
        int right=0;
        int sum=0;
        for(right=0; right<nums.length; right++) {
            sum += nums[right];
            int rem = sum%k;
            if(map.containsKey(rem)) {
                if(right-map.get(rem) > 1){
                    return true;
                }
            }else {
                map.put(rem, right);
            }
        }
        return false;        
    }
}
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int n = nums.length;
        int left=0;
        int right=0;
        int count=0;
        int sum=0;
        for(right=0; right<n; right++) {
            sum += nums[right];
            int rem = (sum%k+k)%k;
            if(map.containsKey(rem)) {
                count +=map.get(rem);
            }map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
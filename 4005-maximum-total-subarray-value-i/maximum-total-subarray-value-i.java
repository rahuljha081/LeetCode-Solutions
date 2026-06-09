class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums[0];
        int r=nums[nums.length-1];
        long ans=(long)k*(r-l);
        return ans;
    }
}
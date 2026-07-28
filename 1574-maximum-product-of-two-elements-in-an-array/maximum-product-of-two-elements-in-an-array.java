class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int val1=nums[nums.length-1]-1;
        int val2=nums[nums.length-2]-1;
        return val1*val2;
    }
}
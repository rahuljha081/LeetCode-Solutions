class Solution {
    
    public int minPairSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int val=nums[start]+nums[end];
            max=Math.max(max,val);
            start++;
            end--;
        }
        return max;
    }
}
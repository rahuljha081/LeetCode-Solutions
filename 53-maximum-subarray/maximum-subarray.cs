public class Solution {
    public int MaxSubArray(int[] nums) {
        
        int curr_sum=0;
        int max_sum=int.MinValue;
        for(int i=0;i<nums.Length;i++){
            curr_sum=Math.Max(nums[i],curr_sum+nums[i]);
            max_sum=Math.Max(max_sum,curr_sum);
        }
        
        return max_sum;
    }
}
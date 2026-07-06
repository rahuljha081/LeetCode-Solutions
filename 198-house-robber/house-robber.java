class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[nums.length+1];
        dp[n]=0;
        dp[n-1]=nums[n-1];
        for(int i=nums.length-2;i>=0;i--){
            int take=nums[i]+dp[i+2];
            int skip=0+dp[i+1];
            dp[i]=Math.max(take,skip);
        }
        return dp[0];
    }
}
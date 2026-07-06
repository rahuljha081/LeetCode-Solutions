class Solution {
    int solve(int [] nums,int i,int n,int dp[]){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+solve(nums,i+2,n,dp);
        int skip=solve(nums,i+1,n,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(solve(nums,1,n,dp1),solve(nums,0,n-1,dp2));
    }
}
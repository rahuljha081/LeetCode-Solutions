class Solution {
    boolean solve(int[] nums,int n,int i,int sum,int dp[][]){
        if(i==n){
            if(sum==0) return true;
            return false;
        }
        if(dp[i][sum]!=-1){
            if(dp[i][sum]==1) return true;
            return false;
        }
        boolean take=false;
        if(nums[i]<=sum){
            take=solve(nums,n,i+1,sum-nums[i],dp);
        }
        boolean skip=solve(nums,n,i+1,sum,dp);
        if(take||skip){
            dp[i][sum]=1;
        }else{
            dp[i][sum]=0;
        }
        return take||skip;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        sum/=2;
        int dp[][]=new int[nums.length+1][sum+1];
        for(int i=0;i<nums.length+1;i++){
            for(int j=0;j<sum+1;j++){
                dp[i][j]=-1;
            }
        }
        return solve(nums,nums.length,0,sum,dp);
    }
}
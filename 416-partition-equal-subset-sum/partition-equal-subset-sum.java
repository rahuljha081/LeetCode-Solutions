class Solution {
    boolean solve(int[] nums,int target,int n,int i,int dp[][]){
        if(dp[i][target]!=-1){
            if(dp[i][target]==0){
                return false;
            }else{
                return true;
            }
        }
        if(i==n){
            return false;
        }
        if(target==0) return true;
        boolean take=false;
        if(nums[i]<=target){
            take=solve(nums,target-nums[i],n,i+1,dp);
        }
        boolean skip=solve(nums,target,n,i+1,dp);
        if(take||skip){
            dp[i][target]=1;
        }else{
            dp[i][target]=0;
        }
        return take||skip;
    }
    public boolean canPartition(int[] nums) {
        int TotalSum=0;
        for(int i=0;i<nums.length;i++){
            TotalSum+=nums[i];
        }
        if(TotalSum%2!=0){
            return false;
        }
        int target=TotalSum/2;
        int dp[][]=new int[nums.length+1][target+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,target,nums.length,0,dp);
    }
}
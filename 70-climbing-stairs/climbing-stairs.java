class Solution {
    int solve(int n,int i,int dp[]){

        if(i==n){
            return 1;
        }

        if(i>n){
            return 0;
        }
         if(dp[i]!=-1){
            return dp[i];
        }
        int oneStep=solve(n,i+1,dp);
        int twoStep=solve(n,i+2,dp);
        return dp[i]= oneStep+twoStep;
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,0,dp);
    }
}
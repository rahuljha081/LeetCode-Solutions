class Solution {
    int solve(int [] coins ,int amount,int n,int i,int dp[][]){
        int INF=1000000000;

        if(amount==0){
            return 0;
        }
           if(i==n){
            return INF;
        }
             if(dp[i][amount]!=-1) {
        return dp[i][amount];
     }
        int take=INF;
        if(coins[i]<=amount){
            take=1+solve(coins,amount-coins[i],n,i,dp);
        }
        int skip=solve(coins,amount,n,i+1,dp);
        return dp[i][amount]=Math.min(take,skip);
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int val=solve(coins,amount,coins.length,0,dp);
        
        
        if(val>=1000000000) return -1;
        return val;
    }
}
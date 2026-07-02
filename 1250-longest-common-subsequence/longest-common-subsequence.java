class Solution {
    int lcs(String s1,String s2,int n,int m,int i,int j,int dp[][]){
        
        if(i==n||j==m) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+lcs(s1,s2,n,m,i+1,j+1,dp);
        }else{
            return dp[i][j]=Math.max(lcs(s1,s2,n,m,i+1,j,dp),lcs(s1,s2,n,m,i,j+1,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                dp[i][j]=-1;
            }
        }
        return lcs(text1,text2,text1.length(),text2.length(),0,0,dp);
    }
}
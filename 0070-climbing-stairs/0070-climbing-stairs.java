class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return helper(n,dp);
    }
    int helper(int n,int[]dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = helper(n-1,dp) + helper(n-2, dp);
    }
}
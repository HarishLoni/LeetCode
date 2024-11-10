class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        int res=solve(dp,m-1,n-1);
        return res;
    }
    
    public static int solve(int dp[][],int m,int n){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        
        int left=solve(dp,m-1,n);
        int up=solve(dp,m,n-1);
        
        return dp[m][n]=left+up;
    }
}
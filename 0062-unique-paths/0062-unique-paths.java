class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        dp[0][0]=1;
        int res=solve(dp,m-1,n-1);
        return res;
    }
    
//     public static int solve(int dp[][],int m,int n){
//         if(m==0 && n==0){
//             return 1;
//         }
//         if(m<0 || n<0){
//             return 0;
//         }
//         if(dp[m][n]!=-1){
//             return dp[m][n];
//         }
        
//         int left=solve(dp,m-1,n);
//         int up=solve(dp,m,n-1);
        
//         return dp[m][n]=left+up;
//     }
    
    public static int solve(int dp[][],int m,int n){
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0){
                    continue;
                }
                int up=0;
                int left=0;
                if(i>0){
                    up=dp[i-1][j];
                }
                if(j>0){
                    left=dp[i][j-1];
                }
                dp[i][j]=up+left;
            }
        }
        return dp[m][n];
    }
}
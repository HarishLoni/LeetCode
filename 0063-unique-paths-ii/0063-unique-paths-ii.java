class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        dp[0][0]=1;
        
        int res=solve(obstacleGrid,dp,m-1,n-1);
        return res;
    }
    
//         public static int solve(int[][] obstacleGrid,int dp[][],int m,int n){
//         if(m==0 && n==0){
//             return 1;
//         }
//         if(m<0 || n<0){
//             return 0;
//         }
//         if(obstacleGrid[m][n]==1){
//             return 0;
//         }


//         if(dp[m][n]!=-1){
//             return dp[m][n];
//         }
        
//         int left=solve(obstacleGrid,dp,m-1,n);
//         int up=solve(obstacleGrid,dp,m,n-1);
        
//         return dp[m][n]=left+up;
//     }
// }
    
    public static int solve(int[][] obstacleGrid,int dp[][],int m,int n){
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0){
                    continue;
                }
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
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


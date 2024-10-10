class Solution {
    int dp[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        
        return dfs(obstacleGrid,0,0);
    }
    
    private int dfs(int[][] obstacleGrid,int row,int col){
        if(row<0 || col<0 || row==obstacleGrid.length || col==obstacleGrid[0].length || obstacleGrid[row][col]==1){
            return 0;
        }
        if(row==obstacleGrid.length-1 && col==obstacleGrid[0].length-1){
            return 1;
        }
        
        if(dp[row][col]>-1) return dp[row][col];
        
        dp[row][col]=dfs(obstacleGrid,row+1,col)+dfs(obstacleGrid,row,col+1);
        
        return dp[row][col];
    }
}
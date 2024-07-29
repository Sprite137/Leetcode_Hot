public class P64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0;i<m; i++){
            for (int j=0; j<n; j++){
                if(i == 0 && j==0){
                    dp[i+1][j+1] = grid[i][j];
                }
                else if(i==0){
                    dp[i+1][j+1] = dp[i+1][j] + grid[i][j];
                }
                else if(j==0){
                    dp[i+1][j+1] = dp[i][j+1] + grid[i][j];
                }
                else{
                    dp[i+1][j+1] = Math.min(dp[i][j+1], dp[i+1][j])+ grid[i][j];
                }
            }
        }
        return dp[m][n];
    }
}

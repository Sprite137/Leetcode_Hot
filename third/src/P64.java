import java.util.Arrays;

/**
 * @author: xuzhi
 * @data: 2024/7/16
 */
public class P64 {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i< m;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for(int i = 0;i< m;i++){
            for(int j = 0;j<n;j++){
                if(j-1 >=0){
                    dp[i][j] = Math.min(dp[i][j],dp[i][j-1]+grid[i][j]);
                }
                if(i-1 >=0){
                    dp[i][j] = Math.min(dp[i][j],dp[i-1][j]+grid[i][j]);
                }


            }
        }
        return dp[m-1][n-1];
    }
}

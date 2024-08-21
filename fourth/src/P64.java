import java.util.Arrays;

/**
 * @author: xuzhi
 * @date: 2024/8/21 17:13
 * @description:
 */

public class P64 {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length-1][grid[0].length-1];
        for(int i = 0; i< grid.length;i++){
            for(int j = 0; j< grid[0].length; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
//            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[0][0] = grid[0][0];
        for(int i = 0 ;i< grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if (i == 0 && j == 0){
                    continue;
                }
                if(i == 0){
                    dp[i][j] = Math.min(dp[i][j],dp[i][j-1]+grid[i][j]);
                    continue;
                }
                if( j == 0){
                    dp[i][j] = Math.min(dp[i][j],dp[i-1][j]+grid[i][j]);
                    continue;
                }
                dp[i][j] = Math.min(dp[i][j],Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}

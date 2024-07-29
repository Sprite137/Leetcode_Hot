/**
 * @author: xuzhi
 * @data: 2024/7/15
 */
public class P62 {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i<=m;i++){
            dp[m][0] = 0;
        }
        for(int j = 0; j<=n;j++){
            dp[0][n] = 0;
        }
        dp[1][1] = 1;
        for(int i = 1;i <= m;i++){
            for(int j = 1; j <=n; j++){
                if(j>1){
                    dp[i][j] += dp[i][j-1];
                }
                if(i>1){
                    dp[i][j] += dp[i-1][j];
                }


            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        System.err.println(uniquePaths(3, 7));
    }
}

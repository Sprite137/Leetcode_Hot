import java.util.Arrays;

/**
 * @author: xuzhi
 * @data: 2024/7/10
 */
public class P279 {
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        for(int i = 1; i<=n; i++){
            if((int)Math.sqrt(i)*(int)Math.sqrt(i) == i){
                dp[i] = 1;
            }
            else {
                dp[i] =dp[(int) Math.sqrt(i)* (int) Math.sqrt(i)]+dp[i-(int) Math.sqrt(i)* (int) Math.sqrt(i)];
                for(int j = i;j>=Math.sqrt(i);j--){
                    dp[i] = Math.min(dp[i-j]+dp[j],dp[i]);
                }

            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        numSquares(13);
    }
}

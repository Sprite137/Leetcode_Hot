/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/7 17:50
 */
import java.util.*;
public class P279 {
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        for(int i = 0; i<=Math.sqrt(n); i++){
            dp[i*i] = 1;
        }
        for(int i = 0; i<=n; i++){
            for(int j = 0;j<i;j++){
                dp[i] = Math.min(dp[i], dp[i-j]+dp[j]);
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.err.println(numSquares(6));
    }
}

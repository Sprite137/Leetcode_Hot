import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: xuzhi
 * @date: 2024/8/20 11:28
 * @description:
 */

public class P279 {
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        for(int i = 0; i<=n;i++){
            if((int) Math.sqrt(i) * (int)Math.sqrt(i) == i){
                dp[i] = 1;
            }
        }
        dp[0] = 0;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=(int) Math.sqrt(i); j++){
                dp[i] = Math.min(dp[i],dp[j*j]+dp[i-j*j]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.err.println(numSquares(13));
    }
}

import java.util.Arrays;

/**
 * @author: xuzhi
 * @date: 2024/8/20 11:40
 * @description:
 */

public class P322 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        for (int coin : coins) {
            if (coin <= amount) {
                dp[coin] = 1;
            }
        }
        dp[0] = 0;

        for(int i=1; i<=amount;i++){
            for(int coin : coins){
                if(coin <= i){
                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }

        }

        return dp[amount] == Integer.MAX_VALUE/2 ?-1:dp[amount];

    }

    public static void main(String[] args) {
        System.err.println(coinChange(new int[]{1, 2, 5}, 11));
    }
}

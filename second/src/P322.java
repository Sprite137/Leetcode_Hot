import java.util.Arrays;
import java.util.Map;

public class P322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        if(amount==0){
            return 0;
        }
        for (int j = 0;j<coins.length;j++){
            if(coins[j]<amount+1){
                dp[coins[j]] = 1;
            }

        }
        for(int i = 1; i <= amount;i++){
            for (int j = 0;j<coins.length;j++){
                if(i>=coins[j]){
                    dp[i] = Math.min(dp[i-coins[j]]+1,dp[i]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE/2 ? -1: dp[amount];
    }

    public static void main(String[] args) {
        P322 x = new P322();
        System.err.println(x.coinChange(new int[]{2}, 0));
    }
}

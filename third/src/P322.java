import java.util.Arrays;

/**
 * @author: xuzhi
 * @data: 2024/7/10
 */
public class P322 {
    public static int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        int[] dp =new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        Arrays.sort(coins);
        for(int i : coins){
            if(i <= amount){
                dp[i] = 1;
            }

        }
        for(int i = 0;i<=amount;i++){
            for(int coin:coins){
                if(i > coin){
                    dp[i] = Math.min(1+dp[i-coin],dp[i]);
                }

            }
        }
        return dp[amount] == Integer.MAX_VALUE/2 ? -1: dp[amount];
    }

    public static void main(String[] args) {
        System.err.println(coinChange(new int[]{1}, 1));
    }
}

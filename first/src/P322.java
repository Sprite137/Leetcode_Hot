import java.util.Arrays;

public class P322 {
    public static int coinChange(int[] coins, int amount) {
        long[] dp = new long[amount+1];

        Arrays.fill(dp, Long.MAX_VALUE/2);
        dp[0]=0;
        for(int i=0;i<=amount;i++){
            for(int num:coins){
                if((long) i+(long) num<=amount){
                    dp[i+num] = Math.min(dp[i+num],dp[i]+1L);
                }

            }
        }
        return dp[amount]==Long.MAX_VALUE?-1: (int) dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {2};
        int amount = 3;
        System.out.println(coinChange(coins,amount));
    }
}

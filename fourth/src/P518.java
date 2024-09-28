/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/8 22:15
 */
public class P518 {
    public static int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        dp[0][0] = 1;
        for(int i = 0; i<=amount;i++){
            for(int j = 0; j<coins.length; j++){
                if(coins[j] <= i){
                    dp[j+1][i] = dp[j][i] + dp[j+1][i-coins[j]];
                }
                else {
                    dp[j+1][i] = dp[j][i];
                }

            }
        }
        return dp[coins.length][amount];
    }

    public static void main(String[] args) {
        System.err.println(change(5, new int[]{1, 2, 5}));
    }
}

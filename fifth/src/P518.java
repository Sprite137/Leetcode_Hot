/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/7 17:20
 */
import java.util.*;
public class P518 {
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,0);
        dp[0] =1;
        for(int i =0; i< coins.length; i++){
            for(int j =0 ; j<= amount; j++){
                if(j >= coins[i]){
                    dp[j] += dp[j-coins[i]];
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        System.err.println(change(5, new int[]{1,2,5}));
    }
}

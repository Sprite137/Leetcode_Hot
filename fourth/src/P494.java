import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/8 23:09
 */
public class P494 {
    public static int findTargetSumWays(int[] nums, int target) {
        target = Math.abs(target);
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(target > sum){
            return 0;
        }
        int[][] dp = new int[nums.length+1][sum*2+1];

        dp[0][sum-nums[0]] = 1;
        dp[0][sum+nums[0]] += 1;
        for(int i = 0;i<nums.length-1;i++){;
            for(int j=-sum;j<=sum; j++){
                if(j - nums[i+1] < -sum){  // 不能-，只能+
                    dp[i+1][j+sum] = dp[i][j+nums[i]+sum];
                }
                else if(j + nums[i+1] > sum){    // 不能+，只能-
                    dp[i+1][j+sum] = dp[i][j-nums[i+1]+sum];
                }
                else{
                    dp[i+1][j+sum] = dp[i][j+nums[i+1]+sum]+dp[i][j-nums[i+1]+sum];
                }
            }
        }
        return dp[nums.length][target+sum];
    }

    public static void main(String[] args) {
        System.err.println(findTargetSumWays(new int[]{1, 0}, 1));
    }
}

import java.util.Arrays;

/**
 * @author: xuzhi
 * @data: 2024/7/15
 */
public class P416 {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int num:nums){
            sum += num;
        }

        if(sum %2 !=0){
            return false;
        }

        boolean[][] dp = new boolean[nums.length+1][sum/2+1];

        for(int i = 0;i<nums.length; i++){
            dp[i][0] = true;
            for(int j = 0;j<=sum/2;j++){
                dp[i+1][j] = dp[i][j];   // 不加index为i的数字
                if(!dp[i+1][j] && j >= nums[i]){
                    dp[i+1][j] = dp[i][j-nums[i]];  // 更新所有加上index的
                }
            }

        }
        return dp[nums.length][sum/2];
    }

    public static void main(String[] args) {
        System.err.println(canPartition(new int[]{1, 2, 3, 4, 6}));
    }
}

public class P416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        if(sum %2 !=0){
            return false;
        }

        // 背包问题
        boolean[][] dp = new boolean[nums.length+1][sum/2+1];
        for (int i = 0;i<=nums.length ;i++){
            dp[i][0] = true;
        }
        for (int i=0; i<nums.length; i++){
            for (int j= 0; j<=sum/2; j++){
                dp[i+1][j] = dp[i][j];          // 不选择此index为i  则dp[i+1][j] = dp[i][j]
                if (!dp[i+1][j] && j >= nums[i]){        // 不选择之后为false，那么就选择此数字:dp[i+1][j] = dp[i][j-nums[i]]
                    dp[i+1][j] = dp[i][j-nums[i]];
                }
            }
        }
        return dp[nums.length][sum/2];
    }

    public static void main(String[] args) {
        P416 x = new P416();
        System.err.println(x.canPartition(new int[]{1, 1}));
    }
}

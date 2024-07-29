import java.util.Scanner;

public class P45 {
    public static int jump(int[] nums) {
        int ans = 0;
        int[] dp = new int[nums.length];
        dp[0] = 0;
        for(int i=1;i<nums.length;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=nums[i] && i+j<nums.length;j++){
                dp[i+j] = Math.min(dp[i]+1,dp[i+j]);
            }
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int jump = jump(nums);
        System.err.println(jump);
    }
}

import java.util.Arrays;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/18 23:21
 */
public class P45 {
    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        dp[0] = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j =i; j<=i+nums[i] && j <nums.length; j++){
                dp[j] = Math.min(dp[j],dp[i]+1);
            }
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        System.err.println(jump(new int[]{2, 3, 1, 1, 4}));
    }
}

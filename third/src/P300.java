import java.util.Arrays;

/**
 * @author: xuzhi
 * @data: 2024/7/11
 */
public class P300 {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int ans = 1;
        Arrays.fill(dp,1);
        for(int i = 0;i<nums.length; i++){
            for(int j = 0; j<i;j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    ans = Math.max(dp[i],ans);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}

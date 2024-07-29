import java.util.Arrays;
import java.util.Map;

public class P45 {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0;i<nums.length;i++){
            if(dp[i] != Integer.MAX_VALUE){
                for(int j =0;j<=nums[i] && i+j < nums.length;j++){
                    dp[i+j] = Math.min(dp[i+j],dp[i]+1);
                }
            }
        }
        return dp[nums.length-1];
    }
}

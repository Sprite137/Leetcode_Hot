import java.util.Arrays;
import java.util.Map;

public class P300 {
    public int lengthOfLIS(int[] nums) {
        int max = 1;
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,1);
        for(int i = 1; i<nums.length; i++){
            for (int j = 0;j<=i;j++){
                if(nums[i]>nums[j]){
                    dp[i+1] = Math.max(dp[i+1],dp[j+1]+1);

                }
                max = Math.max(max,dp[i+1]);

            }
        }
        return max;
    }

    public static void main(String[] args) {
        P300 x = new P300();
        System.err.println(x.lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6}));
    }
}

import java.util.Arrays;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/20 20:34
 */
public class P300 {
//    public static int lengthOfLIS(int[] nums) {
//        int[] dp = new int[nums.length];
//        Arrays.fill(dp,1);
//        int ans = 1;
//        for(int i = 0 ;i<nums.length; i++){
//            for(int j =i;j>=0;j--){
//                if(nums[i] > nums[j]){
//                    dp[i] = Math.max(dp[i],dp[j]+1);
//                }
//                ans = Math.max(ans,dp[i]);
//            }
//        }
//
//        return ans;
//    }
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int ans = 1;
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }

                ans  = Math.max(dp[i],ans);
            }
        }
        return ans;
}

    public static void main(String[] args) {
        System.err.println(lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }
}

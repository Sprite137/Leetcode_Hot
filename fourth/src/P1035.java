/**
 * @author: xuzhi
 * @date: 2024/8/11 18:18
 * @description:
 */

public class P1035 {
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        // 最长公共-子-序列
        int[][] dp = new int[nums1.length+1][nums2.length+1];

        for(int i = 0;i < nums1.length; i++){
            for(int j = 0; j< nums2.length ;j++){
                if(nums1[i] == nums2[j]){
                    dp[i+1][j+1] = dp[i][j]+1;
                }else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[nums1.length][nums2.length];
    }


    public static void main(String[] args) {
        System.err.println(maxUncrossedLines(new int[]{1, 2, 4}, new int[]{1, 2, 5,2}));
    }
}

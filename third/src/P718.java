public class P718 {
    public int findLength(int[] nums1, int[] nums2) {
        int index1 = 0, index2 = 0;
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        int ans = 0;
        for(int i = 0;i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    dp[i+1][j+1]  = dp[i][j]+1;
                    ans = Math.max(dp[i+1][j+1],ans);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        P718 x = new P718();
        System.err.println(x.findLength(new int[]{0,0,0,0,0}, new int[]{0,0,0,0,0}));
    }
}

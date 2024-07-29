public class P53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                dp[i] = nums[i];
            }
            else {
                if(dp[i-1]<=0){
                    dp[i] = nums[i];
                }
                else {
                    dp[i] = dp[i-1]+nums[i];
                }
            }

        }
        int max = Integer.MIN_VALUE;
        for(int num:dp){
            max = Math.max(max,num);
        }
        return max;
    }


}

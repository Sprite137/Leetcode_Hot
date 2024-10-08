public class P138 {
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length+2];
        if(nums.length==1){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
//        if(nums.length<=2){
//            return dp[nums.length-1];
//        }
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }


    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(rob(nums));
    }
}

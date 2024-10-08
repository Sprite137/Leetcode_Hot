import java.util.Map;

public class P198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        else if(nums.length ==2){
            return Math.max(nums[0],nums[1]);
        }
        for(int i = 0;i<2;i++){
            dp[i] = nums[i];
        }
        for(int i=2;i<nums.length ; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }

        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        P198 x = new P198();
        System.err.println(x.rob(new int[]{1, 2, 3, 1}));
    }
}

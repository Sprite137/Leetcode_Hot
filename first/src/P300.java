import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class P300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int res = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
//        Stack<Integer> stack = new Stack<>();
//        int ans = 0;
//        for(int i=0;i<nums.length;i++){
//            while(!stack.isEmpty() && nums[i]<=stack.peek()){
//                ans = Math.max(ans,stack.size());
//                stack.pop();
//            }
//            stack.add(nums[i]);
//        }
//        return Math.max(ans,stack.size());
    }



    public static void main(String[] args) {
//        test(2);
//        test(Integer.valueOf(2));
    }

}

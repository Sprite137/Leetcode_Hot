/**
 * @author: xuzhi
 * @date: 2024/8/8 10:13
 * @description:
 */

public class P53 {
    public static int maxSubArray(int[] nums) {
        int[] pre = new int[nums.length];
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            pre[i] = sum;
            sum += nums[i];
        }

        int ans = Integer.MIN_VALUE;
        int minPre = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length; i++){
            minPre = Math.min(pre[i],minPre);
            ans =  Math.max(ans,pre[i] - minPre + nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}

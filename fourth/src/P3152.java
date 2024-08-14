import java.util.Arrays;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/14 8:30
 */
public class P3152 {
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];

        int[] dp = new int[nums.length];
        for(int i = 1; i < nums.length; i++){
            if((nums[i] + nums[i-1]) %2 !=0){
                dp[i] = dp[i-1];
            }
            else {
                dp[i] = i;
            }
        }
        for(int i = 0; i < queries.length; i++){
        ans[i] = dp[queries[i][1]] <= dp[queries[i][0]];
    }
        return ans;


    }

    public boolean query(int[] nums, int start , int end){
        boolean isOld = nums[start] %2 ==0;
        for(int i = start+1; i <= end; i++){
            if((nums[i] % 2 == 0) == (isOld)){
                return false;
            }
            isOld = !isOld;
        }
        return true;
    }

    public static void main(String[] args) {
        System.err.println(Arrays.toString(isArraySpecial(new int[]{3, 4, 1, 2, 6}, new int[][]{{0, 4}})));
    }
}

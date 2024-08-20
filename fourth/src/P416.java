import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/20 21:15
 */
public class P416 {
//    boolean flag = false;
//    public boolean canPartition(int[] nums) {
//        Arrays.sort(nums);
//        int sum = 0;
//        for(int num :nums){
//            sum += num;
//        }
//        if(sum %2 !=0){
//            return false;
//        }
//        backTrack(0,0,sum/2,nums,0,new ArrayList<>());
//        return flag;
//    }
//
//    public void backTrack(int index, int length, int target, int[] nums, int sum, List<Integer> base){
//        if(sum >= target){
//            if(sum == target){
//                flag = true;
//            }
//        }
//        else {
//            if(!flag){
//                for(int i = 0 ;i<nums.length; i++){
//                    // 选
//                    if(!base.contains(i)){
//                        sum += nums[i];
//                        base.add(i);
//                        backTrack(index,length,target,nums,sum,base);
//                        sum -= nums[i];
//                        base.remove(base.size()-1);
//                    }
//
//                }
//            }
//        }
//    }
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int num :nums){
            sum += num;
        }
        if(sum %2 !=0){
            return false;
        }


        // 01背包问题
        boolean[][] dp = new boolean[nums.length+1][sum/2+1];
        for(int i = 0 ;i<nums.length;i++){
            dp[i][0] = true;
            for(int j = 0; j<= sum/2;j++){
                dp[i+1][j] = dp[i][j];
                if(!dp[i+1][j] && j >= nums[i]){
                    dp[i+1][j] = dp[i][j-nums[i]];
                }
            }
        }


        return dp[nums.length][sum/2];
    }

    public static void main(String[] args) {
        P416 x = new P416();
        System.err.println(x.canPartition(new int[]{1,2,3,8}));
    }
}

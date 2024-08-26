import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/25 14:19
 * @description:
 */

public class P698 {
//    public static boolean canPartitionKSubsets(int[] nums, int k) {
//        int sum = 0;
//        for(int num: nums){
//            sum += num;
//        }
//        if(sum % k != 0){
//            return false;
//        }
//        int target = sum/k;
//
//        while( k-- >0){
//            // 分割子集
//            boolean[] dp = new boolean[target+1];
//            for(int num:nums){
//                if(num <= target){
//                    dp[num] = true;
//                }
//            }
//            for (int num : nums) {
//                for (int j = 0; j <= target; j++) {
//                    if (j + num <= target && !dp[j+num]) {
//                        dp[j + num] = dp[j];
//                    }
//                }
//            }
//            if(!dp[target] ){
//                return false;
//            }
//
//            // 找出index，将其置0
//
//        }
//        return true;
//    }
    static List<List<Integer>> list = new ArrayList<>();
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % k != 0){
            return false;
        }
        dfs(nums,0,0,new ArrayList<>(),sum/k,0);
        return list.size() == k;
    }

    public static void dfs(int[] nums, int index, int length, List<Integer> base, int target, int sum){
        if(sum >= target){
            if(sum ==target){
                List<Integer> temp = new ArrayList<>(base);
                Collections.sort(temp);
                if(!list.contains(temp)){
                    list.add(temp);
                }
            }

        }
        else {
            for(int i = 0;i <nums.length; i++){
                if(!base.contains(i)){
//                    dfs(nums,index,length,base,target,sum);

                    base.add(i);
                    sum += nums[i];
                    dfs(nums,index,length,base,target,sum);
                    base.remove(base.size()-1);
                    sum -= nums[i];

                }
            }
        }
    }


    public static void main(String[] args) {
        System.err.println(canPartitionKSubsets(new int[]{4,3,2,3,5,2,1}, 4));
    }
}

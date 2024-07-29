import dongtaiProxy.MoveAble;

import java.util.Arrays;

public class P152 {
    public int maxProduct(int[] nums) {
        int[] dp_pos = new int[nums.length];
        int[] dp_neg = new int[nums.length];
        for(int i=0;i<nums.length;i++){
                dp_pos[i] = nums[i];
                dp_neg[i] = nums[i];
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                dp_pos[i] = Math.max(dp_pos[i],Math.max(dp_neg[i-1]*nums[i],dp_pos[i-1]*nums[i]));
                dp_neg[i] = Math.min(dp_neg[i],Math.min(dp_neg[i-1]*nums[i],dp_pos[i-1]*nums[i]));
            }

            ans = Math.max(ans,dp_pos[i]);
        }
        return ans;
    }
}

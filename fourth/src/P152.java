import java.util.Arrays;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/20 20:44
 */
public class P152 {
    public static int maxProduct(int[] nums) {
        int ans  =Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        int[] pos = new int[nums.length];
        int[] neg = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            pos[i] = nums[i];
            neg[i] = nums[i];
            ans = Math.max(ans,Math.max(pos[i],neg[i]));
        }

        for(int i = 1 ;i<nums.length; i++){
            if(nums[i] <0){
                pos[i] = Math.max(neg[i-1]*nums[i],pos[i]);
                neg[i] = Math.min(pos[i-1]*nums[i],neg[i]);
            }
            else {
                pos[i] = Math.max(pos[i-1]*nums[i],pos[i]);
                neg[i] = Math.min(neg[i-1]*nums[i],neg[i]);
            }
            ans = Math.max(ans,Math.max(pos[i],neg[i]));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(maxProduct(new int[]{2,-1,1,1}));
    }
}

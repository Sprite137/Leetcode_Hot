import java.util.Arrays;

/**
 * @author: xuzhi
 * @data: 2024/7/11
 */
public class P152 {
    public static int maxProduct(int[] nums) {

        float[] pos = new float[nums.length];

        float[] neg = new float[nums.length];
        for(int i = 0; i<nums.length; i++){
            pos[i] = nums[i];
            neg[i] = nums[i];
        }
        if(nums.length ==1){
            return nums[0];
        }
        float    ans= pos[0];

        for(int i = 1;i<nums.length; i++){
            pos[i] = Math.max(pos[i]* neg[i-1],Math.max(nums[i]*pos[i-1],nums[i])) ;
            neg[i] = Math.min(nums[i] * pos[i-1],Math.min(nums[i],nums[i]*neg[i-1]));
            ans = Math.max(pos[i],ans);
            ans = Math.max(neg[i],ans);
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.err.println(maxProduct(new int[]{0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0}));
    }

}

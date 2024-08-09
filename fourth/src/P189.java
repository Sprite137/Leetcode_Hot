import java.util.Arrays;

/**
 * @author: zhizxu
 * @date: 2024/8/8 10:50
 * @description:
 */

public class P189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k == 0){
            return;
        }

        reverse(nums,0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k,nums.length-1);

    }

    public void reverse(int[] nums, int start, int end){
        for(int i = 0;i < (end-start)/2+1; i++){
            int temp = nums[start+i];
            nums[start+i] = nums[end-i];
            nums[end-i] = temp;
        }
    }

    public static void main(String[] args) {
        P189 x = new P189();
        int[] nums = new int[]{1,2};
        x.rotate(nums,3);
        System.err.println(Arrays.toString(nums));
    }
}

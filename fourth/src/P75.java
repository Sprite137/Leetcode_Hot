import java.util.Arrays;

/**
 * @author: xuzhi
 * @date: 2024/8/23 17:15
 * @description:
 */

public class P75 {
    public static void sortColors(int[] nums) {
        // 排序0,2
        int index0 = 0;
        int index2 = nums.length-1;


        for(int i = 0; i < index2; i++){
            if(nums[i] == 0){
                nums[i] = nums[index0];
                nums[index0++] = 0;
            }

            if(nums[i] == 2){
                nums[i] = nums[index2];
                nums[index2--] = 2;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.err.println(Arrays.toString(nums));
    }
}

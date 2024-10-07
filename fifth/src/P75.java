import java.util.Arrays;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/7 16:02
 */
public class P75 {
    public static void sortColors(int[] nums) {
        int n0 = 0, n1 =0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            nums[i] = 2;
            if(num < 2){
                nums[n1++] =1;
            }
            if(num < 1){
                nums[n0++] = 0;
            }
        }
    }

    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
}

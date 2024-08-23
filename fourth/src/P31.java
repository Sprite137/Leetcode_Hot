import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: xuzhi
 * @date: 2024/8/23 17:46
 * @description:
 */

public class P31 {
    public static void nextPermutation(int[] nums) {
        int index = 0;
        for(int i = 1; i< nums.length-1; i++){
            if(nums[i] >= nums[i-1]){
                index = i;
                break;
            }
        }
        if(index == 0){
            Arrays.sort(nums);
            return;
        }

        if(nums[index] == nums.length){

        }
        else {
            Arrays.sort(nums,index,nums.length);
            return;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        nextPermutation(nums);
        System.err.println(Arrays.toString(nums));
    }
}

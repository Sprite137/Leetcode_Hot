import java.util.Arrays;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/8 21:01
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,2,1,4,5,9,7,5,4,3,45,10};
        quickSort(nums,0,nums.length-1);
        System.err.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int start, int end){
        if(start < end){
            int left  = start;
            int right = end;
            int base = nums[start];

            while(left <right){
                while(left < right && nums[right] >= base){
                    right--;
                }
                nums[left] = nums[right];
                while(left < right && nums[left] <= base){
                    left++;
                }
                nums[right] = nums[left];
            }
            nums[left] = base;
            quickSort(nums,start,left-1);
            quickSort(nums,left+1,end);
        }
    }
}

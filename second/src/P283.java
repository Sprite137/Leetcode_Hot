import java.util.Arrays;

public class P283 {
    public static void moveZeroes(int[] nums) {
        int left = 0, right=1;
        while(right<nums.length){
            if(left==right){
                right++;
                continue;
            }
            if (nums[left] == 0 && nums[right] == 0){
                right++;
            }
            else if (nums[left] == 0){
                int temp = nums[right];
                nums[right] = 0;
                nums[left] = temp;
                left++;
            }
            else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.err.println(Arrays.toString(nums));
    }
}

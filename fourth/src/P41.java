/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/10 0:15
 */
public class P41 {
    public static int firstMissingPositive(int[] nums) {
        // 交换
        for(int i = 0; i <nums.length ;i++){
            while(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }


        for(int i = 0;i<nums.length ; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}

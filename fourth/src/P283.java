/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/6 22:43
 */
public class P283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0;i<nums.length; i++){
            if(nums[i] != 0 ){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}

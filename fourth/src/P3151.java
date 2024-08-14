/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/13 22:48
 */
public class P3151 {
    public boolean isArraySpecial(int[] nums) {
        boolean isOld = (nums[0] %2 ==0);
        for(int i = 1; i<nums.length; i++){
            if((nums[i] % 2 == 0) == (isOld)){
                return false;
            }
            isOld = !isOld;

        }
        return  true;
    }
}

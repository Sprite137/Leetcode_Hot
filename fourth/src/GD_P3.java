/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/22 19:54
 */
public class GD_P3 {
    public boolean containsNearbyDuplicate (int[] nums, int k) {
        for(int i = 0;i<nums.length; i++){
            for(int j = i+1;j<nums.length; j++){
                if(nums[i] == nums[j] && j-i>=k){
                    return true;
                }
            }
        }
        return false;
    }
}

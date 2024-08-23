/**
 * @author: xuzhi
 * @date: 2024/8/23 17:05
 * @description:
 */

public class P169 {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                ans = nums[i];
            }
            if(nums[i] == ans){
                count++;
            }
            else {
                count--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(majorityElement(new int[]{3, 2, 3}));
    }
}

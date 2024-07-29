import java.util.HashMap;
import java.util.HashSet;

public class P287 {
    public int findDuplicate(int[] nums) {
        int pre = nums[0];
        for(int i=1;i<nums.length;i++){

            pre = pre ^ nums[i];
            if(pre==0){
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,2,2};
        P287 x = new P287();
        x.findDuplicate(nums);
    }
}


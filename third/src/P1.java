import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length ;i++){
            if(map.containsValue(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}

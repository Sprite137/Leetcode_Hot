import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PLCR119 {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int ans = 1;
        for(int num:set){
            if(set.contains(num+1)){
                continue;
            }
            int tempAns = 1;
            int temp = num;
            while(set.contains(temp-1)){
                tempAns++;
                temp--;
            }
            ans = Math.max(ans,tempAns);
        }
        return ans;
    }
}

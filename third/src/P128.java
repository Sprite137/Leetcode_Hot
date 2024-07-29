import java.io.Serializable;
import java.util.*;

public class P128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans = 0;
        for(int num:nums){
            int cur = num;
            while(!set.contains(cur-1)){
                while(set.contains(cur +1)){
                    cur++;
                }
            }
            ans = Math.max(ans,cur - num+1);
        }
        return ans;
    }
}

import java.util.HashSet;
import java.util.Set;

/**
 * @author: xuzhi
 * @data: 2024/8/4
 */
public class P128 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num :nums){
            set.add(num);
        }

        int ans = 0;
        for(int num :nums){
            if(set.contains(num-1)){
                continue;
            }
            int temp = num;
            while(set.contains(temp+1)){
                temp++;
            }
            ans = Math.max(temp-num+1,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}

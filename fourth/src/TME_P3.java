import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/23 20:04
 */
public class TME_P3 {
    public long min_value (int[] nums, int m) {
        long ans = 0L;
        List<Long> list = new ArrayList<>();
        for(int num :nums){
            list.add((long)num);
        }
        for(int i = 1; i<=m;i++){
            list.add((long)i);
        }
        Collections.sort(list);
        for(int i = 0;i<list.size()-1; i++){
            ans += Math.abs(list.get(i)-list.get(i+1));
        }
        return ans;
    }
}

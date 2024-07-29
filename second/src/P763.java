import java.util.ArrayList;
import java.util.List;

public class P763 {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int[] first = new int[26];
        List<Integer> ans = new ArrayList<>();

        // 记录最后一次出现的位置
        for(int i = 0;i<s.length(); i++){
            last[s.charAt(i)-'a'] = i;
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);       // 记录当前的最大end
            if (i == end) {         // 成功分割出一个: i==当前的end
                ans.add(end - start + 1);
                start = end + 1;
            }
        }

        return ans;
    }
}

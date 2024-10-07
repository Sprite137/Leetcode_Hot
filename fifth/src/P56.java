/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/6 20:04
 */
import java.util.*;
public class P56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o1[0] - o2[0];
            }
        });
        Stack<int[]> stack = new Stack<>();
        stack.add(intervals[0]);
        for(int i = 1; i< intervals.length; i++){
            if(stack.peek()[1] > intervals[i][0]){
                int[] temp = stack.pop();
                stack.add(new int[]{temp[0],Math.max(temp[1],intervals[i][1])});
            }
            else{
                stack.add(intervals[i]);
            }
        }
        int[][] ans = new int[stack.size()][2];
        for(int i = 0; i < stack.size(); i++){
            ans[ans.length-i-1] = stack.pop();
        }
        return ans;

    }
}

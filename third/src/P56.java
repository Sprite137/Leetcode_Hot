import java.util.Arrays;
import java.util.Stack;

public class P56 {
    public int[][] merge(int[][] intervals) {
        Stack<int[]> stack = new Stack<>();
        Arrays.sort(intervals, (l1,l2) ->{
            return l1[0]-l2[0];
        });
        for (int[] ints: intervals){
            if(stack.isEmpty()){
                stack.add(ints);
            }
            else {
                int[] temp = stack.peek();
                if(temp[1] >= ints[0]){
                    stack.pop();
                    stack.add(new int[]{temp[0],Math.max(temp[1],ints[1])});
                }
                else {
                    stack.add(ints);
                }
            }
        }
        int[][] ans  = new int[stack.size()][2];
        for(int i = stack.size()-1;i>=0;i--){
            ans[i]  = stack.pop();
        }
        return ans;
    }
}

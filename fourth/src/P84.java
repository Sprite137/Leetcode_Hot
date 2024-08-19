import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author: xuzhi
 * @date: 2024/8/18 16:40
 * @description:
 */

public class P84 {
    public static int largestRectangleArea(int[] heights) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ;i<heights.length; i++){
            int min = Integer.MAX_VALUE;
            while(!stack.isEmpty() && heights[stack.peek()] < heights[i] ){
                int index = stack.pop();
                min = Math.min(min,heights[index]);
                ans = Math.max(ans,(i-index+1)*min);
            }
            stack.add(i);
            ans = Math.max(ans,heights[i]);
        }
        //  剩余stack的最大值
        List<Integer> list = new ArrayList<>(stack);

        return ans;
    }

    public static void main(String[] args) {
        System.err.println(largestRectangleArea(new int[]{2,0,2}));
    }
}

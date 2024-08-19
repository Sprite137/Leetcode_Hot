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
        // 维护递增栈
        for(int i = 0 ;i<heights.length; i++){
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()] ){
                int index = stack.pop();
                if(!stack.isEmpty()){
                    ans = Math.max(ans,(i-stack.peek()-1)*heights[index]);
                }
                else {
                    ans = Math.max(ans,heights[index]*i);
                }

            }
            stack.add(i);
            ans = Math.max(ans,heights[i]);
        }

        //  剩余stack的最大值
        while(!stack.isEmpty()){        // 0 1 2 3 4
            int index =  stack.pop();
            if(!stack.isEmpty()){
                ans = Math.max(ans,heights[index]*(heights.length-stack.peek()-1));
            }
            else {
                ans = Math.max(ans,heights[index]*heights.length);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(largestRectangleArea(new int[]{5,4,1,2}));
    }
}

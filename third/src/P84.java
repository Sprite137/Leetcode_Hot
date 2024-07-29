import java.util.*;

/**
 * @author: xuzhi
 * @data: 2024/7/10
 */
public class P84 {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        int ans = 0;

        for(int i = 0;i< heights.length; i++){
            while(stack.peek() != -1 && heights[i] < heights[stack.peek()]){        // 保持栈递增
                ans = Math.max(heights[stack.pop()] * (i-stack.peek()-1),ans);
            }
            stack.push(i);

        }
        while(stack.peek() != -1){
            ans = Math.max(ans,heights[stack.pop()]*(heights.length-stack.peek()-1));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.err.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}


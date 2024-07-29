import java.util.Map;
import java.util.Stack;

public class P84 {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = Integer.MIN_VALUE;
        stack.push(-1);
        for(int i=0;i<heights.length;i++){
            while(stack.peek()!=-1 && heights[stack.peek()]>heights[i]){        //新输入的小
                int index = stack.pop();
                maxArea = Math.max(maxArea,heights[index]*(i-stack.peek()-1));
            }
            stack.push(i);
        }
        while(stack.peek()!=-1){        //新输入的小
            int index = stack.pop();
            maxArea = Math.max(maxArea,heights[index]*(heights.length-stack.peek()-1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}

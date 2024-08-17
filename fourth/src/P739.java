import java.util.Stack;

/**
 * @author: xuzhi
 * @date: 2024/8/17 17:26
 * @description:
 */

public class P739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i= 0; i< temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                int index = stack.pop();
                ans[index] = i-index;
            }
            stack.add(i);
        }

        return ans;
    }
}

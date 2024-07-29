import java.util.Stack;

public class P739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int pre = stack.pop();
                ans[pre] = i-pre;
            }
            stack.add(i);
        }
        return ans;
    }
}

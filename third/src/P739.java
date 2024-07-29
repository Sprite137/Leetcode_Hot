import java.util.Arrays;
import java.util.Stack;

public class P739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                ans[index] = i-index;
            }
            stack.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        P739 x = new P739();
        System.err.println(Arrays.toString(x.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}

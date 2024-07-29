import java.util.Stack;

/**
 * @author: xuzhi
 * @data: 2024/7/19
 */
public class P32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);
        int ans = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else {
                    ans  = Math.max(ans,i - stack.peek());
                }
            }
        }
        return ans;


    }
}

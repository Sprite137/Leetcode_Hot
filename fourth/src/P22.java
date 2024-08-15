import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/15 23:38
 */
public class P22 {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        backTrack(0,0,n,new StringBuilder());
        return ans;
    }


    public void backTrack(int index, int length,int n, StringBuilder sb ){
        if(sb.length() == n*2){
            if(isValid(sb.toString())){
                ans.add(sb.toString());
            }
        }
        else {
            // 加(
            sb.append('(');
            backTrack(index,length+1,n,sb);
            sb.deleteCharAt(sb.length()-1);

            // 加)
            sb.append(')');
            backTrack(index,length+1,n,sb);
            sb.deleteCharAt(sb.length()-1);

        }
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch :s.toCharArray()){
            if(ch =='('){
                stack.add(ch);
            }
            else {
                if(stack.isEmpty() || stack.peek() != '('){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

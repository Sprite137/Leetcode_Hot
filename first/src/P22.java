import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P22 {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n,new StringBuilder());
        return ans;
    }

    public void dfs(int n,StringBuilder s){
        if(s.length()==2*n){
            if(isEff(s)){
                ans.add(new String(s));
            }
        }
        else {

            dfs(n,s.append("("));
            s.deleteCharAt(s.length()-1);
            dfs(n,s.append(")"));
            s.deleteCharAt(s.length()-1);
        }
    }

    public boolean isEff(StringBuilder s){
        Stack<Character> stack = new Stack();
        for(char a:s.toString().toCharArray()){
            if(a=='('){
                stack.add(a);
            }
            else {
                if(stack.isEmpty() || stack.peek()!='('){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}

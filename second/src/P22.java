import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P22 {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        back(n*2, 0 , 0 , new StringBuilder());
        return ans;
    }

    public void back(int n, int index, int length, StringBuilder base){
        if(length == n){
            if(isValid(base)){
                ans.add(String.valueOf(base));
            }
        }
        else if(length <n) {
            // 加'('
            base.append('(');
            back(n,index,length+1,base);
            base.deleteCharAt(base.length()-1);

            // 加')'
            base.append(')');
            back(n,index,length+1,base);
            base.deleteCharAt(base.length()-1);

        }
    }

    public boolean isValid(StringBuilder base){
        Stack<Character> stack = new Stack<>();
        for(char a: base.toString().toCharArray()){
            if(a == '('){
                stack.add(a);
            }
            else {
                if(stack.isEmpty() || stack.peek() != '('){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        P22 x = new P22();
//        System.err.println(x.isValid(new StringBuilder("(())")));
        System.err.println(x.generateParenthesis(3));
    }
}

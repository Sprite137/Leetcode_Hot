import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P22 {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        back(0,0,n*2,new StringBuilder());
        return ans;

    }

    public void back(int index, int length,int n,StringBuilder base){
        if(length == n){
            if(isValid(base.toString())){
                ans.add(base.toString());
            }
        }
        else {
            base.append('(');
            back(index,length+1,n,base);
            base.deleteCharAt(base.length()-1);

            base.append(')');
            back(index,length+1,n,base);
            base.deleteCharAt(base.length()-1);
        }
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.add(ch);
            }
            else {
                if(ch == '('){
                    stack.add(ch);
                }
                else {
                    if(stack.peek() != '('){
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        P22 x= new P22();
        System.err.println(x.generateParenthesis(2));
    }
}

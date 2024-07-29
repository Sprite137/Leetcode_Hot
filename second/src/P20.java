import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P20 {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                if (stack.isEmpty() || !stack.peek().equals(map.get(ch)) ){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
            else {
                stack.add(ch);
            }
        }
        return stack.isEmpty();
    }
}

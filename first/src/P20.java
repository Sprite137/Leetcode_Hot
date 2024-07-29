import java.util.HashMap;
import java.util.Stack;

public class P20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        for(char a:s.toCharArray()){
            if(map.containsValue(a)){
                stack.push(a);
            }
            else {
                if(stack.isEmpty() || stack.peek() != map.get(a)){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}

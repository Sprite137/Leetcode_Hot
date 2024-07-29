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
        for(int i = 0; i<s.length(); i++){
            // 前括号逻辑
            if(map.containsValue(s.charAt(i))){
                stack.add(s.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                if(!map.get(s.charAt(i)).equals(stack.peek())){
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

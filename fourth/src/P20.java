import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: xuzhi
 * @date: 2024/8/17 16:20
 * @description:
 */

public class P20 {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(map.containsValue(ch)){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty() || stack.peek() != map.get(ch)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

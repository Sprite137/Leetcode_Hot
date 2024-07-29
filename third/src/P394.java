
import java.util.Stack;

/**
 * @author: xuzhi
 * @data: 2024/7/9
 */
public class P394 {
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == ']'){
                StringBuilder temp = new StringBuilder();
                while(stack.peek() != '['){
                    temp.append(stack.pop());
                }
                temp.reverse();
                stack.pop();

                StringBuilder num = new StringBuilder();
                while (true){
                    try{
                        num.append(Integer.parseInt(String.valueOf(stack.peek())));
                        stack.pop();
                    }
                    catch (Exception e){
                        break;
                    }
                }

                num.reverse();
                for(int i = 0; i< Integer.parseInt(String.valueOf(num)); i++){
                    for(char a: temp.toString().toCharArray()){
                        stack.add(a);
                    }
                }
            }
            else {
                stack.add(ch);
            }
        }
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.err.println(decodeString("a100[leetcode]"));
//        System.err.println(Integer.parseInt(String.valueOf('0')));
    }
}

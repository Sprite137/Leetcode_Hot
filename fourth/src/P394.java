import java.util.Scanner;
import java.util.Stack;

/**
 * @author: xuzhi
 * @date: 2024/8/17 16:51
 * @description:
 */

public class P394 {
    public static String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.add(ch);
            }
            else {
                StringBuilder reverseWord = new StringBuilder();
                while(stack.peek() != '['){
                    reverseWord.append(stack.pop());
                }
                stack.pop();
                String word = String.valueOf(reverseWord.reverse());
                StringBuilder reverseNum = new StringBuilder();
                int num = 0;
                while(!stack.isEmpty() && (stack.peek() - 48 >= 0 && stack.peek()- 58 <0)){
                    reverseNum .append(stack.pop());
                }
                if(reverseNum.toString().isEmpty()){
                    num = 1;
                }else {
                    num  = Integer.parseInt(reverseNum.reverse().toString());
                }

                for( int i = 0; i < num; i++){
                    for(char a: word.toCharArray()){
                        stack.add(a);
                    }
                }

            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.err.println(decodeString("2[abc]3[cd]ef"));
    }
}

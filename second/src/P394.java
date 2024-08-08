import java.util.Stack;

public class P394 {
//    public static String decodeString(String s) {
//        StringBuilder ans = new StringBuilder();
//        Stack<Character> stack = new Stack<>();
//        for (char ch : s.toCharArray()){
//            if(ch == ']'){
//                StringBuilder seg = new StringBuilder();
//                while(stack.peek()!='['){
//                    seg.append(stack.pop());
//                }
//                stack.pop();
//                seg.reverse();
//                StringBuilder num = new StringBuilder();
//                while(!stack.isEmpty() && (stack.peek() -'0' >=0 && stack.peek()-'0'<10)){
//                    num.append(stack.pop());
//                }
//                num.reverse();
//                String repeat = seg.toString().repeat(Integer.parseInt(num.toString()));
//                for(char a: repeat.toCharArray()){
//                    stack.add(a);
//                }
//            }
//            else {
//                stack.add(ch);
//            }
//
//
//
//        }
//        while (!stack.isEmpty()){
//            ans.append(stack.pop());
//        }
//        return ans.reverse().toString();
//    }
//
//    public static void main(String[] args) {
//        System.err.println(decodeString( "2[ab1[a]]ef"));
//    }
}

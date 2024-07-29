import java.util.Stack;

public class P394 {
    public static String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']'){
                stack.add(s.charAt(i));
            }
            else {
                StringBuilder temp_s = new StringBuilder();
                StringBuilder temp_num = new StringBuilder();
                while(stack.peek()!='['){
                    temp_s.append(stack.pop());
                }
                stack.pop();
                while(!stack.isEmpty() && stack.peek()-'0' <= 9) {
                    temp_num.append(stack.pop());
                }
                int num = Integer.parseInt(temp_num.reverse().toString());
                String a = temp_s.reverse().toString();
                for(int x=0;x<num;x++){
                    for(char c:a.toCharArray()){
                        stack.add(c);
                    }
                }

            }
        }
        for(char a:stack){
            ans.append(a);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "23[a]56[b]89[c]";
        System.err.println(decodeString(s));
//        System.err.println('9'-'0');
    }
}

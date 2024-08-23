import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/23 19:01
 */
public class TME_P1 {
    public static int merge (ListNode a) {
        // write code here
        ListNode cur = a;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while(cur != null){
            if(!stack.isEmpty()){
                if((cur.val == 0 && stack.peek() ==0) || (cur.val !=0 && stack.peek() != 0)){
                    ans++;
                    int temp = stack.pop();
                    stack.add(Math.max(cur.val, temp));
                }
                else {
                    stack.add(cur.val);
                }
            }
            else {
                stack.add(cur.val);
            }
            cur = cur.next;
        }
        return ans;

    }

    public static void main(String[] args) {
        ListNode x = new ListNode();
        x.create(x,new int[]{0,1,0});
        System.err.println(merge(x));
    }
}

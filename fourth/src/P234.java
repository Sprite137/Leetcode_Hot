import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: xuzhi
 * @date: 2024/8/10 18:55
 * @description:
 */

public class P234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }

        for(int i = 0;i<list.size()/2;i++){
            if(!Objects.equals(list.get(i), list.get(list.size() - i - 1))){
                return false;
            }
        }
        return true;
    }
}

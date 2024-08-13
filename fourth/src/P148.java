import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: xuzhi
 * @date: 2024/8/11 15:36
 * @description:
 */

public class P148 {
    public ListNode sortList(ListNode head) {
        ListNode cur = head;
        List<Integer> list = new ArrayList<>();
        while (cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(list);
        cur = head;
        int index = 0;
        while(cur != null){
            cur.val = list.get(index++);
            cur = cur.next;
        }
        return head;
    }
}

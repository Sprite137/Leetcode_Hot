import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P148 {
    public ListNode sortList(ListNode head) {
        ListNode cur = head;
        List<Integer> list = new ArrayList<>();
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(list);
        cur = head;
        for(int num:list){
            cur.val = num;
            cur = cur.next;
        }
        return head;

    }
}

import java.util.*;

/**
 * @author: xuzhi
 * @date: 2024/8/11 15:36
 * @description:
 */

public class P148 {
//    public ListNode sortList(ListNode head) {
//        ListNode cur = head;
//        List<Integer> list = new ArrayList<>();
//        while (cur != null){
//            list.add(cur.val);
//            cur = cur.next;
//        }
//        Collections.sort(list);
//        cur = head;
//        int index = 0;
//        while(cur != null){
//            cur.val = list.get(index++);
//            cur = cur.next;
//        }
//        return head;
//    }
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode dummy = new ListNode();
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = null;
            priorityQueue.add(cur);
            cur = temp;
        }
        while(!priorityQueue.isEmpty()){
            pre.next = priorityQueue.poll();
            pre = pre.next;
        }
        return dummy.next;
    }
}

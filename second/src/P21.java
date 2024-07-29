public class P21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode ans = new ListNode();
        ListNode ans_ = ans;
        while (list1 != null || list2  != null){
            if(list1 == null){
                while(list2 != null){
                    ans.val = list2.val;
                    if(list2.next != null){
                        ans.next = new ListNode();
                    }
                    list2 = list2.next;
                    ans = ans.next;
                }
                break;
            }
            if(list2 == null){
                while(list1 != null){
                    ans.val = list1.val;
                    if(list1.next != null){
                        ans.next = new ListNode();
                    }
                    list1 = list1.next;
                    ans = ans.next;
                }
                break;
            }
            if(list1.val > list2.val){
                ans.val = list2.val;
                list2 = list2.next;
                ans.next = new ListNode();
                ans = ans.next;
            }
            else {
                ans.val = list1.val;
                list1 = list1.next;
                ans.next = new ListNode();
                ans = ans.next;
            }
        }
        return ans_;
    }
}

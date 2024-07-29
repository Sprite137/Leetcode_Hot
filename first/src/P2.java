public class P2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        ListNode cur = l1;
        while(cur!=null){
            s1.append(cur.val);
            cur = cur.next;
        }
        cur = l2;
        while(cur!=null){
            s2.append(cur.val);
            cur = cur.next;
        }
        int carry = 0;
        int max_length =Math.max(s1.length(),s2.length());
        if(s1.length()==max_length){
            s2.append("0".repeat(Math.max(0, s1.length() - s2.length())));
        }
        else {
            s1.append("0".repeat(Math.max(0, s2.length() - s1.length())));
        }
        s1.reverse();
        s2.reverse();
        StringBuilder ans = new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--){
            int res = (s1.charAt(i)-'0')+(s2.charAt(i)-'0')+carry;
            if(res>=10){
                carry = res/10;
            }
            else {
                carry = 0;
            }
            ans.append(res%10);
        }
        if(carry>0){
            ans.append(carry);
        }
//        ans.reverse();
        ListNode head = new ListNode();
        ListNode head1 = head;
        for(int i = 0;i<ans.length();i++){
            head.val = ans.charAt(i)-'0';
            if(i!=ans.length()-1){
                head.next = new ListNode();
                head = head.next;
            }
        }
        return head1;

    }


    public static void main(String[] args) {
        int[] l1 = {2,4,3,1}, l2 = {5,6,4};
        ListNode a = new ListNode();
        ListNode a1 = a.create(l1);
        ListNode b = new ListNode();
        ListNode b1 = a.create(l2);
        addTwoNumbers(a1,b1);
    }
}

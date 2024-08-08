import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class P2 implements Cloneable{
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
//        ListNode cur = new ListNode();
//        cur = l1;
//        while(cur != null){
//            s1.append(cur.val);
//            cur = cur.next;
//        }
//
//        cur = l2;
//        while(cur != null){
//            s2.append(cur.val);
//            cur = cur.next;
//        }
//
//        if(s1.length() > s2.length()){
//            s2.append("0".repeat (s1.length()-s2.length()));
//        }
//        else {
//            s1.append("0".repeat (s2.length()-s1.length()));
//        }
//
//
//        s1.reverse();s2.reverse();
//        StringBuilder s = new StringBuilder();
//        int carry = 0;
//        for( int index = s1.length()-1; index>=0;index-- ){
//            int num = carry + s1.charAt(index)-'0'+s2.charAt(index)-'0';
//            carry = num/10;
//            s.append(num%10);
//        }
//        if(carry>0){
//            s.append(carry);
//        }
////        s.reverse();
//        ListNode ans = new ListNode();
//        cur = ans;
//        for(int i = 0; i< s.length(); i++){
//            cur.val = s.charAt(i)-'0';
//
//            if( i != s.length()-1){
//                cur.next = new ListNode();
//            }
//            cur = cur.next;
//        }
//
//        return ans;
//
//    }

//    public static String add(StringBuilder s1, StringBuilder s2){
//        if(s1.length() > s2.length()){
//            s2.append("0".repeat (s1.length()-s2.length()));
//        }
//        else {
//            s1.append("0".repeat (s2.length()-s1.length()));
//        }
//
//
//        s1.reverse();s2.reverse();
//        StringBuilder s = new StringBuilder();
//        int carry = 0;
//        for( int index = s1.length()-1; index>=0;index-- ){
//            int num = carry + s1.charAt(index)-'0'+s2.charAt(index)-'0';
//            carry = num/10;
//            s.append(num%10);
//        }
//        if(carry>0){
//            s.append(carry);
//        }
//        s.reverse();
//        return s.toString();
//    }
//
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode cur1 = l1, cur2  = l2, prev1 = null, join = null, last = null;
//        int carry = 0;
//        while(cur1 != null ||   cur2!= null){
//            if(cur2 == null){
//                cur2 = new ListNode();
//            }
//            cur1.val = cur2.val+cur1.val+carry;
//            carry = cur1.val/10;
//            cur1.val = cur1.val % 10;
//            prev1 =cur1 ;
//            if(cur1.next == null){
//                cur1.next = cur2.next;
//                cur2.next = null;
//            }
//            cur1 = cur1.next;
//            cur2 = cur2.next;
//
//        }
//        if(carry > 0){
//            prev1.next = new ListNode(carry);
//        }
//
//
//
//        return l1;
//
//    }
//
//    public static void main(String[] args) {
////        System.err.println(add(new StringBuilder("2432"), new StringBuilder("564")));
////        ListNode x = new ListNode();
////        ListNode listNode1 = x.create(new int[]{5});
////        ListNode y = new ListNode();
////        ListNode listNode = y.create(new int[]{5, 6, 4});
////        addTwoNumbers(listNode1,listNode);
////            Object
//    }
}

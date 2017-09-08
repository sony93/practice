package LC;

import java.util.WeakHashMap;

/**
 * Created by Administrator on 2017/8/31.
 */
public class no160 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //先将其中一个链表的链头按到另一个链表的尾部，如果他们有交集则会构成一个环，题目等价于找链表中的环的起始结点。找到后将链表还原。

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        ListNode wei_A;
        ListNode head_A = headA;
        while (head_A.next != null)
            head_A = head_A.next;
        wei_A = head_A;

        wei_A.next = headB;

        //连起来后判断是否有环

        ListNode fast = headA;
        ListNode slow = headA;
        while (fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                break;
        }
        if(fast == null || fast.next == null){
            wei_A.next = null;
            return null;
        }
        slow = headA;
        while (slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        head_A.next = null;
        return slow;
    }

    public static void main(String[] args){
        ListNode head1 = null;
        head1 = new ListNode(1);
        ListNode temp1 = head1;

        ListNode head2 = null;
        head2 = new ListNode(-1);
        ListNode temp2 = head2;
        temp2.next = new ListNode(0);
        temp2 = temp2.next;

        for (int i = 2; i < 4; i++){
            temp1.next = new ListNode(i);
            temp1 = temp1.next;
        }

        ListNode gong = null;
        gong = new ListNode(5);
        ListNode temp = gong;
        temp1.next = gong;
        temp2.next = gong;

        for (int x = 6; x < 8; x++){
            temp.next = new ListNode(x);
            temp = temp.next;
        }
//        for (int x = 5; x < 8; x++){
//            temp1.next = new ListNode(x);
//            temp2.next = new ListNode(x);
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }

//        while (head2 != null){
//            System.out.println(head2.val);
//            head2 = head2.next;
//        }
//
//        while (head1 != null){
//            System.out.println(head1.val);
//            head1 = head1.next;
//        }

         System.out.println(getIntersectionNode(head1, head2).val);


    }
}

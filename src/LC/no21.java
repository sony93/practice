package LC;

/**
 * Created by Administrator on 2017/9/5.
 */
public class no21 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode head = null;
        if(l1.val < l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        }
        else {
            head = l2;
            head.next =mergeTwoLists(l1, l2.next);
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head1 = null;
        ListNode head2 = null;

        head1 = new ListNode(1);
        head2 = new ListNode(0);

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        temp1.next = new ListNode(3);
        temp1 = temp1.next;
        temp1.next = new ListNode(5);
        temp1 = temp1.next;
        temp1.next = new ListNode(6);
        temp2.next = new ListNode(2);
        temp2 = temp2.next;
        temp2.next = new ListNode(4);
        temp2 = temp2.next;
        temp2.next = new ListNode(6);
        ListNode head = mergeTwoLists(head1, head2);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }


}

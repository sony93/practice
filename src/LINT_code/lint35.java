package LINT_code;

/**
 * Created by sony on 17-11-29.
 */
public class lint35 {
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode nex = null;
        while (head != null){
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }
}

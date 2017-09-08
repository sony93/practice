package LC;

/**
 * Created by Administrator on 2017/8/4.
 */
public class no203 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        ListNode target = head;
        while (target.next != null){
            if(target.next.val == val){
                target.next = target.next.next;
            }
            else
                target = target.next;
        }
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i < 7; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp.next = new ListNode(3);
        ListNode head1 = removeElements(head, 1);
        ListNode target = head1;
        while (target != null){
            System.out.println(target.val);
            target = target.next;
        }
    }
}

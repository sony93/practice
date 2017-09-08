package LC;

/**
 * Created by Administrator on 2017/9/4.
 */
public class no83 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null){
            if(temp.next == null)
                break;
            if(temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head = null;
        head = new ListNode(1);
        ListNode temp = head;

        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        deleteDuplicates(head);
    }
}

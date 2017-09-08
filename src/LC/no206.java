package LC;

/**
 * Created by Administrator on 2017/8/4.
 */
public class no206 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null){
            ListNode target = head.next;
            head.next = prev;
            prev = head;
            head = target;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i < 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }

    }
}

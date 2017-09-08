package LC;

/**
 * Created by Administrator on 2017/9/4.
 */
public class no141 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode quick = head;
        ListNode slow = head;
        while (quick != null && quick.next != null){
            quick = quick.next.next;
            slow = slow.next;
            if(quick == slow)
                break;
        }
        if(quick == null || quick.next == null)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = new ListNode(1);
        ListNode temp = head;

        ListNode cy = null;
        for (int i = 2; i < 7; i++) {
            temp.next = new ListNode(i);
            if (i == 4) {
                cy = temp.next;
            }
            temp = temp.next;
        }

        temp.next = cy;
        System.out.println(hasCycle(head));
//        ListNode temp2 = head;
//        for (int n = 0; n < 22; n++){
//            System.out.println(temp2.val);
//            temp2 = temp2.next;
//        }

    }
}

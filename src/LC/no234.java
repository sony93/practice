package LC;

/**
 * Created by Administrator on 2017/8/3.
 */
public class no234 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null){
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


    public static void main(String[] args){
        ListNode head = null;
        head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i < 5; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        for (int l = 4; l > 0; l--){
            temp.next = new ListNode(l);
            temp = temp.next;
        }
//        ListNode test = head;
//        while (test != null){
//            System.out.println(test.val);
//            test = test.next;
//        }
        System.out.println(isPalindrome(head));
    }
}

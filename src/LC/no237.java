package LC;

import java.util.Stack;

/**
 * Created by Administrator on 2017/8/1.
 */
public class no237 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args){
        ListNode head = null;
        ListNode aim = null;
        head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i < 5; i++){
            temp.next = new ListNode(i);
            if(i == 3){
                aim = temp.next;
            }
            temp = temp.next;
        }
        deleteNode(aim);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}

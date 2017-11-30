package LINT_code;

import java.util.Stack;

/**
 * Created by sony on 17-11-29.
 */
public class lint36 {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (m >= n || head == null) {
            return head;
        }
        if(m == n)
            return head;
        Stack<ListNode> stack = new Stack<>();

        ListNode pre = null;
        ListNode nex = null;
        ListNode p = head;
        int i = 1;

        while (i <= n){
            if(i < m){
                if(i == m - 1)
                    pre = p;
                p = p.next;
            }
            else if(i >= m && i <= n){
                stack.push(p);
                p = p.next;
            }
            i++;
        }
        nex = p;
        if(pre == null){
            head = stack.pop();
            pre = head;
        }
        while (!stack.isEmpty()){
            pre.next = stack.pop();
            pre = pre.next;
        }
        pre.next = nex;
        return head;
    }

    public static void main(String[] args){
        ListNode head = null;
        head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i < 6; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        reverseBetween(head, 2, 4);
    }
}

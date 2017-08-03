package Learn_algorithm.linklist;

import java.util.Stack;

/**
 * Created by Administrator on 2017/8/1.
 */
public class LinkedListSummary {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int n) {
            this.val = n;
            this.next = null;
        }
    }


    public static void deleteNode(ListNode node) {

    }

    //求；链表结点个数
    public static int getListLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode nex = null;
        while (head != null) {//head随着nex的后移而后移，pre随着head的后移而后移，head.next反过来指向pre
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }

    //将单链表反转,递归
    public static ListNode reverseListRec(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode reHead = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return reHead;
    }

    //查找单链表中的倒数第K个结点（k > 0）
    public static ListNode reGetKthNode(ListNode head, int k) {
        if (head == null)
            return head;
        int len = getListLength(head);
        if (k > len)
            return null;
        ListNode target = head;
        ListNode nexk = head;
        //双指针 其中一个先走k个，之后一起走即可
        for (int i = 0; i < k; i++) {
            nexk = nexk.next;
        }
        while (nexk != null) {
            target = target.next;
            nexk = nexk.next;
        }
        return target;
    }

    //查找单链表的中间结点
    public static ListNode getMiddleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode target = head;
        ListNode temp = head;
        //一个一次走一个，一个一次走两个
        while (temp != null && temp.next != null) {
            target = target.next;
            temp = temp.next.next;
        }
        return target;
    }

    //从尾到头打印单链表,递归
    public static void reversePrintListRec(ListNode head) {
        if (head == null) return;
        else {
            reversePrintListRec(head.next);
            System.out.println(head.val);
        }
    }

    //从尾到头打印单链表,栈
    public static void reversePrintListStack(ListNode head) {
        Stack<ListNode> s = new Stack<ListNode>();
        while (head != null) {
            s.push(head);
            head = head.next;
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop().val);
        }
    }

    //合并两个有序的单链表head1和head2，循环
    public static ListNode mergeSortedList(ListNode head1, ListNode head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        ListNode target = null;
        if (head1.val > head2.val) {
            target = head2;
            head2 = head2.next;
        } else {
            target = head1;
            head1 = head1.next;
        }
        target.next = null;
        ListNode mergehead = target;
        while (head1 != null && head2 != null) {
            if (head1.val > head2.val) {
                target.next = head2;
                head2 = head2.next;
            } else {
                target.next = head1;
                head1 = head1.next;
            }
            target = target.next;
            target.next = null;
        }
        if (head1 == null)
            target.next = head2;
        else
            target.next = head1;
        return mergehead;
    }

    //对单链表进行排序,归并排序,在排序里面不建议选用递归的合并有序链表算法，如果链表长度较长，很容易出现栈溢出
    public static ListNode listSort(ListNode head) {
        ListNode nex = null;
        if (head == null || head.next == null)
            return head;
        else if (head.next.next == null) {
            nex = head.next;
            head.next = null;
        } else {
            ListNode mid = getMiddleNode(head);
            nex = mid.next;
            mid.next = null;
        }
        return mergeSortedList(listSort(head), listSort(listSort(nex)));
        //合并两个有序链表
    }

//    //对单链表进行排序,插入排序
//    public ListNode insertionSortList(ListNode head) {
//        if(head == null || head.next == null)
//            return head;
//
//    }


    //判断一个单链表中是否有环,快慢指针
    public static boolean hasCycle(ListNode head) {
        boolean flag = false;
        ListNode p1 = head;
        ListNode p2 = head;
        while (p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p2 == p1) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        ListNode head = null;
        head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i < 6; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
//        System.out.println(head.next.next.next.val);
//        System.out.println(getListLength(head));
//        ListNode head2 = reverseList(head);
//        System.out.println(head2.next.next.val);


    }
}

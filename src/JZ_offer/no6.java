package JZ_offer;

/**
 * Created by sony on 17-12-12.
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class no6 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if(listNode == null){
            return arrayList;
        }
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    //递归
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode node = listNode;
        if(node != null){
            if(node.next != null){
                arrayList = printListFromTailToHead2(node.next);
            }
            arrayList.add(node.val);
        }
        return arrayList;
    }

    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        System.out.println(printListFromTailToHead(listNode));
    }
}

package LINT_code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by sony on 17-11-23.
 */
public class lint69 {
//    queue.offer();queue.add()区别
//    两者都是往队列尾部插入元素，不同的时候，当超出队列界限的时候，add（）方法是抛出异常让你处理，而offer（）方法是直接返回false
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultArray = new ArrayList<List<Integer>>();
        // write your code here
        if(root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode tmp = null;
        while (!queue.isEmpty()){
            List<Integer> cur = new ArrayList<Integer>();
            int len = queue.size();
            for (int i = 0; i < len; i++){
                tmp = queue.poll();
                if(tmp.left != null){
                    queue.add(tmp.left);
                }
                if(tmp.right != null){
                    queue.add(tmp.right);
                }
                cur.add(tmp.val);
            }
            resultArray.add(cur);
        }
        return resultArray;
    }

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        System.out.println(lint69.levelOrder(treeNode));
    }


}

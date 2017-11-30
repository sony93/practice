package LINT_code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by sony on 17-11-24.
 */
public class lint70 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            resultArray.add(0,cur);
        }
        return resultArray;
    }

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        System.out.println(lint70.levelOrderBottom(treeNode));
    }
}

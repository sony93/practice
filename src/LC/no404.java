package LC;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sony on 18-1-15.
 */
public class no404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null)
            return 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null)
                sum += root.left.val;
            else
                sum += sumOfLeftLeaves(root.left);
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public int sumOfLeftLeaves2(TreeNode root) {
        if(root == null || root.left == null && root.right == null) return 0;
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur.left != null && cur.left.left == null && cur.left.right == null)
                sum += cur.left.val;
            if(cur.left != null)
                queue.add(cur.left);
            if(cur.right != null)
                queue.add(cur.right);
        }
        return sum;
    }
}

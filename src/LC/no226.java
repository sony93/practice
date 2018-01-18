package LC;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sony on 18-1-11.
 */
public class no226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = invertTree(left);
        root.left = invertTree(right);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            final TreeNode node = queue.poll();
            final TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
}

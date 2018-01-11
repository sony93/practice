package LC;

import java.util.Stack;

/**
 * Created by sony on 18-1-11.
 */
public class no104 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepth2(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int max = 0;
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);
            if (node.left != null) {
                stack.push(node.left);
                value.push(temp + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                value.push(temp + 1);
            }
        }
        return max;
    }
}

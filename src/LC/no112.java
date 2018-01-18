package LC;

import java.util.Stack;

/**
 * Created by sony on 18-1-12.
 */
public class no112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.val == sum && root.left == null && root.right == null)
            return true;
        return false || hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public boolean hasPathSum2(TreeNode root, int sum) {
        if(root == null)
            return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur.left == null && cur.right == null){
                if(cur.val == sum)
                    return true;
            }
            if(cur.left != null){
                cur.left.val += cur.val;
                stack.push(cur.left);
            }
            if(cur.right != null){
                cur.right.val += cur.val;
                stack.push(cur.right);
            }
        }
        return false;
    }
}

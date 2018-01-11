package LC;

import java.util.Stack;

/**
 * Created by sony on 18-1-9.
 */
public class no101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        else if(root.left == null || root.right == null)
            return false;
        else {
            Stack<TreeNode> l = new Stack<>();
            Stack<TreeNode> r = new Stack<>();
            l.push(root.left);
            r.push(root.right);
            while (!(l.isEmpty() && r.isEmpty())){
                TreeNode nq = l.pop();
                TreeNode np = r.pop();

                if(nq.val != np.val)
                    return false;

                if (nq.left != null) {
                    l.push(nq.left);
                }
                if (np.right != null) {
                    r.push(np.right);
                }

                if (l.size() != r.size()) {
                    return false;
                }

                if (nq.right != null) {
                    l.push(nq.right);
                }
                if (np.left != null) {
                    r.push(np.left);
                }

                if (l.size() != r.size()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSymmetric2(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        int nu = (left == null ? 1 : 0) + (right == null ? 1 : 0);
        if (nu == 1)
            return false;
        if (nu == 2)
            return true;
        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}

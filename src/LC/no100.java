package LC;

import java.util.Stack;

/**
 * Created by sony on 18-1-9.
 */
public class no100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else if(p == null || q == null)
            return false;
        else if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }

    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else if(p == null || q == null)
            return false;
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();

        pStack.push(p);
        qStack.push(q);

        while (!(pStack.isEmpty() && qStack.isEmpty())){
            TreeNode nq = qStack.pop();
            TreeNode np = pStack.pop();

            if(nq.val != np.val)
                return false;

            if (nq.left != null) {
                qStack.push(nq.left);
            }
            if (np.left != null) {
                pStack.push(np.left);
            }

            if (qStack.size() != pStack.size()) {
                return false;
            }

            if (nq.right != null) {
                qStack.push(nq.right);
            }
            if (np.right != null) {
                pStack.push(np.right);
            }

            if (qStack.size() != pStack.size()) {
                return false;
            }


        }
        return true;
    }
}

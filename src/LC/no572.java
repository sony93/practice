package LC;

import java.util.Stack;

/**
 * Created by sony on 18-1-18.
 */
public class no572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        TreeNode cur = s;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(cur);
        while (!stack.isEmpty()){
            cur = stack.pop();
            if(equal(cur, t))
                return true;
            if(cur.right != null)
                stack.push(cur.right);
            if(cur.left != null)
                stack.push(cur.left);
        }
        return false;
    }

    public boolean equal(TreeNode s, TreeNode t){
        if(s == null && t == null)
            return true;
        else if(s == null || t == null)
            return false;
        return equal(s.left, t.left) && equal(s.right, t.right) && s.val == t.val;
    }
}

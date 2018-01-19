package LC;

import java.util.Stack;

/**
 * Created by Administrator on 2018/1/19.
 */
public class no617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        if (t1 == null && t2 == null)
            return null;
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[] {t1, t2});
        while (!stack.isEmpty()){
            TreeNode cur1 = stack.pop()[0];
            TreeNode cur2 = stack.pop()[1];
            if(cur1 == null || cur2 == null)
                continue;
            cur1.val += cur2.val;
            if(cur1.left == null)
                cur1.left = cur2.left;
            else
                stack.push(new TreeNode[] {cur1.left, cur2.left});
            if(cur1.right == null)
                cur1.right = cur2.right;
            else
                stack.push(new TreeNode[] {cur1.right, cur2.right});
        }
        return t1;
    }
}

package LC;

/**
 * Created by sony on 18-1-12.
 */
public class no235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((p.val >= root.val && q.val <= root.val) || (p.val <= root.val && q.val >= root.val))
            return root;
        else if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return lowestCommonAncestor(root.left, p, q);
    }
}

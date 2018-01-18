package LC;

/**
 * Created by sony on 18-1-18.
 */
public class no563 {
    int cha = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return cha;
    }

    public int sum(TreeNode root){
        if(root == null)
            return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        cha += Math.abs(left - right);
        return left + right + root.val;
    }
}

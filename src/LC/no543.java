package LC;

/**
 * Created by sony on 18-1-18.
 */
public class no543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int p_root = cal_length(root.left) + cal_length(root.right);
        int p_root_l = diameterOfBinaryTree(root.left);
        int p_root_r = diameterOfBinaryTree(root.right);
        return Math.max(p_root, Math.max(p_root_l, p_root_r));
    }

    public int cal_length(TreeNode treeNode){
        if(treeNode == null)
            return 0;
        return Math.max(cal_length(treeNode.left), cal_length(treeNode.right)) + 1;//找到左右子树中最长的一条路径
    }
}

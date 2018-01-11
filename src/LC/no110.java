package LC;

/**
 * Created by sony on 18-1-11.
 */
public class no110 {
    public boolean isBalanced(TreeNode root) {//boolean并不能记录高度差
        if(root == null)
            return true;
        return maxheight(root) != -1;
    }

    public int maxheight(TreeNode root){
        if(root == null)
            return 0;
        int l_height = maxheight(root.left);
        if(l_height == -1)
            return -1;
        int r_height = maxheight(root.right);
        if(r_height == -1)
            return -1;
        if(l_height-r_height < -1 || l_height-r_height > 1)
            return -1;//如果树子树的高度差大于1，则该结点的高度定义为-1
        return 1 + Math.max(l_height, r_height);
    }


}

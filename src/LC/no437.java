package LC;

/**
 * Created by sony on 18-1-18.
 */
public class no437 {
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int dfs(TreeNode root, int sum){
        if(root == null)
            return 0;
        return (root.val == sum ? 1 : 0) + dfs(root.left, sum - root.val) + dfs(root.right, sum - root.val);

    }
}

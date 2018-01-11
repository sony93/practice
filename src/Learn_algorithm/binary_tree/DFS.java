package Learn_algorithm.binary_tree;

import java.util.Stack;

/**
 * Created by sony on 18-1-11.
 */
public class DFS {
    public static void dfs(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            System.out.println(treeNode.val);
            if(treeNode.right != null)
                stack.push(treeNode.right);
            if(treeNode.left != null)
                stack.push(treeNode.left);
        }
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);
        a.left.right = new TreeNode(5);
        a.right.left = new TreeNode(6);
        a.right.right = new TreeNode(8);
        a.left.right.right = new TreeNode(9);
        dfs(a);
    }
}

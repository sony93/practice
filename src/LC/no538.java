package LC;

import java.util.Stack;

/**
 * Created by sony on 18-1-15.
 */
public class no538 {
    public static TreeNode convertBST(TreeNode root) {
        if(root == null)
            return null;
        int sum = 0;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || cur != null){
            while (cur != null){
                stack.push(cur);
                cur = cur.right;
            }
            cur = stack.pop();
            sum += cur.val;
            cur.val = sum;

            cur = cur.left;
        }
        return root;
    }

    public static TreeNode convertBST2(TreeNode root) {
        int sum = 0;
        if (root != null) {
            convertBST2(root.right);
            sum += root.val;
            root.val = sum;
            convertBST2(root.left);
        }
        return root;
    }

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(13);
        convertBST(treeNode);
        System.out.println(treeNode.right.val);
    }
}

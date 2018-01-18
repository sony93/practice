package Learn_algorithm.binary_tree;

import java.util.Stack;

/**
 * Created by Administrator on 2017/12/26.
 */
public class bian_li {
    public static void front(TreeNode treeNode){
        if(treeNode == null)
            return;
        else {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(treeNode);
            while (!stack.isEmpty()){
                TreeNode temp = stack.pop();
                System.out.println("当前节点的值：" + temp.val);
                if(temp.right != null)
                    stack.push(temp.right);
                if(temp.left != null)
                    stack.push(temp.left);
            }
        }
    }

    public static void mid(TreeNode treeNode){
        if(treeNode == null)
            return;
        else {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || treeNode != null){
                if(treeNode != null){
                    stack.push(treeNode);
                    treeNode = treeNode.left;
                }
                else {
                    TreeNode temp = stack.pop();
                    System.out.println("当前节点的值：" + temp.val);
                    treeNode = temp.right;
                }

            }
        }
    }

    public static void behind(TreeNode treeNode){
        if(treeNode == null)
            return;
        else {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(treeNode);
            TreeNode printNode = null;
            while (!stack.isEmpty()) {
                treeNode = stack.peek();
                if (treeNode.left != null && printNode != treeNode.left && printNode != treeNode.right)
                    stack.push(treeNode.left);
                else if (treeNode.right != null && printNode != treeNode.right)
                    stack.push(treeNode.right);
                else {
                    System.out.println("当前值为：" + stack.pop().val);
                    printNode = treeNode;
                }
            }
        }
    }

    public static void front_xunhan(TreeNode treeNode){
        System.out.println(treeNode.val);
        if(treeNode.left != null)
            front_xunhan(treeNode.left);
        if(treeNode.right != null)
            front_xunhan(treeNode.right);
    }

    public static void mid_xunhan(TreeNode treeNode){
        if(treeNode.left != null)
            mid_xunhan(treeNode.left);
        System.out.println(treeNode.val);
        if(treeNode.right != null)
            mid_xunhan(treeNode.right);
    }

    public static void behind_xunhan(TreeNode treeNode){
        if(treeNode.left != null)
            behind_xunhan(treeNode.left);
        if(treeNode.right != null)
            behind_xunhan(treeNode.right);
        System.out.println(treeNode.val);
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        t1.right.left = new TreeNode(6);
        mid_xunhan(t1);
    }
}

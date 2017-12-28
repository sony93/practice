package LC;

import java.util.Stack;

/**
 * Created by Administrator on 2017/7/3.
 */
public class no606 {
    public static String tree2str(TreeNode t) {
        String s = "";
        if(t == null)
            return s;
        Stack<Object> stack = new Stack<>();
        stack.push(t);
        while (!stack.isEmpty()){
            Object temp = stack.pop();
            if(temp instanceof TreeNode) {
                TreeNode treeNode = (TreeNode) temp;
                s = s + treeNode.val;
                if(treeNode.right != null || treeNode.left != null) {
                    if (treeNode.right != null) {
                        stack.push(")");
                        stack.push(treeNode.right);
                        stack.push("(");
                    }
                    if (treeNode.left != null) {
                        stack.push(")");
                        stack.push(treeNode.left);
                        stack.push("(");
                    }
                    else {
                        stack.push(")");
                        stack.push("(");
                    }
                }
            }
            else {
                s = s + (String) temp;
            }
        }
        return s;
    }

    public static String tree2str2(TreeNode t) {
        StringBuilder builder = new StringBuilder();
        if(t == null){
            return "";
        }
        Stack<Object> stack = new Stack<Object>();
        //根节点入栈
        stack.push(t);
        while(!stack.empty()){
            //栈中包含TreeNode类型的二叉树节点，也包含String类型的括号
            Object temp = stack.pop();
            //判断是否为TreeNode类型
            if(temp instanceof TreeNode){
                TreeNode node = (TreeNode) temp;
                builder.append(node.val);
                //如果该节点左右节点都为空，则不执行任何代码，否则，执行以下代码
                if(node.left != null || node.right != null){
                    if(node.right != null){
                        stack.push(")");
                        stack.push(node.right);
                        stack.push("(");
                    }
                    if(node.left != null){
                        stack.push(")");
                        stack.push(node.left);
                        stack.push("(");
                    }else{
                        stack.push(")");
                        stack.push("(");
                    }

                }
            }
            //判断是否为String类型
            if(temp instanceof String){
                //String类型直接拼接到builder
                builder.append((String) temp);
            }
        }
        return builder.toString();
    }


    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        t1.right.left = new TreeNode(6);
        System.out.println(tree2str(t1));
    }
}

package LC;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by sony on 18-1-17.
 */
public class no113 {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<>();
        if(root == null)
            return paths;
        Stack<TreeNode> stack = new Stack<>();
        int count = 0;
        TreeNode cur = root;
        TreeNode pre = null;
        while (!stack.isEmpty() || cur != null){
            while (cur != null){
                stack.push(cur);
                path.add(cur.val);
                count += cur.val;
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.left == null && cur.right == null && sum == count){
                paths.add(new ArrayList<Integer>(path));
            }

            if(cur.right != null && cur.right != pre){
                cur = cur.right;
                continue;
            }
            stack.pop();
            pre = cur;
            path.remove(path.size() - 1);
            count -= cur.val;
            cur = null;

        }
        return paths;
    }

    public static List<List<Integer>> pathSum2(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<>();
        dfs(root, sum, path, paths);
        return paths;
    }

    private static void dfs(TreeNode root, int sum, List<Integer> currentResult, List<List<Integer>> result){
        if (root == null)
            return;
        currentResult.add(new Integer(root.val));
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new ArrayList(currentResult));
            currentResult.remove(currentResult.size() - 1);
            return;
        }
        else {
            dfs(root.left, sum - root.val, currentResult, result);
            dfs(root.right, sum - root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size() - 1);
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        t1.right.left = new TreeNode(3);
        System.out.println(pathSum2(t1, 7));
    }
}

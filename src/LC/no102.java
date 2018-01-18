package LC;

import java.util.*;

/**
 * Created by sony on 18-1-15.
 */
public class no102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(root == null)
            return lists;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int cur = 0;
        int last = 1;
        while (cur < stack.size()){
            last = stack.size();
            List<Integer> integerList = new ArrayList<>();
            while (cur < last){
                integerList.add(stack.get(cur).val);
                if(stack.get(cur).left != null)
                   stack.push(stack.get(cur).left);
                if(stack.get(cur).right != null)
                    stack.push(stack.get(cur).right);
                cur++;
            }
            lists.add(integerList);
        }
        return lists;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }


}

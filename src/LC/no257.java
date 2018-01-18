package LC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sony on 18-1-12.
 */
public class no257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> stringList = new ArrayList<>();
        String path = "";
        if(root == null)
            return stringList;
        findPaths(stringList, "", root);
        return stringList;
    }

    private void findPaths(List<String> result,String temp,TreeNode root) {
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            result.add(temp + Integer.toString(root.val));
            return;
        }
        findPaths(result, temp + Integer.toString(root.val) + "->", root.left);
        findPaths(result, temp + Integer.toString(root.val) + "->", root.right);
    }
}

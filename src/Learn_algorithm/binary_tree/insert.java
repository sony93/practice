package Learn_algorithm.binary_tree;

/**
 * Created by Administrator on 2017/12/26.
 */
public class insert {
    public void insert(TreeNode treeNode, int data){
        if(data > treeNode.val){
            if(treeNode.right == null)
                treeNode.right = new TreeNode(data);
            else {
                this.insert(treeNode.right, data);
            }
        }
        else{
            if(treeNode.left == null)
                treeNode.left = new TreeNode(data);
            else
                this.insert(treeNode.left, data);
        }
    }
}

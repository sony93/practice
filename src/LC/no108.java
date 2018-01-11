package LC;

/**
 * Created by sony on 18-1-11.
 */
public class no108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        TreeNode head = bst(nums, 0, nums.length - 1);
        return head;
    }

    public TreeNode bst(int[] nums, int low, int high){
        if(low > high)
            return null;
        int mid = (low + high) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = bst(nums, low, mid - 1);
        treeNode.right = bst(nums, mid + 1, high);
        return treeNode;
    }
}

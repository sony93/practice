package LC;

/**
 * Created by sony on 18-1-17.
 */
//中序遍历有序
public class no501 {
    public int[] findMode(TreeNode root) {
        zhongxu(root);
        modes = new int[modeCount];
        modeCount = 0;
        currCount = 0;
        zhongxu(root);
        return modes;
    }

    private int currVal;
    private int currCount = 0;
    private int maxCount = 0;
    private int modeCount = 0;

    private int[] modes;

    public void zhongxu(TreeNode root){
        if (root == null) return;
        zhongxu(root.left);
        handleValue(root.val);
        zhongxu(root.right);
    }

    public void handleValue(int val){
        if (val != currVal) {
            currVal = val;
            currCount = 0;
        }
        currCount++;
        if(currCount > maxCount){
            maxCount = currCount;
            modeCount = 1;
        }
        else if(currCount == maxCount){
            if(modes != null)
                modes[modeCount] = currVal;
            modeCount++;
        }
    }
}

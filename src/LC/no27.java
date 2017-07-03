package LC;

/**
 * Created by Administrator on 2017/6/30.
 */
public class no27 {
    public static int removeElement(int[] nums, int val) {
        int begin = 0;
        int n = nums.length;
        while (begin < n){
            if (nums[begin] == val) {
                nums[begin] = nums[n - 1];
                n--;
            }
            else
                begin++;
        }
        return n;
    }

    public static void main(String[] args){
        int[] nums = {3, 2, 2, 3, 3, 3};
        System.out.println(removeElement(nums, 3));
    }
}

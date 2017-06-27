package LC;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/22.
 */
public class no189 {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - k);
        reverse(nums, nums.length - k, nums.length);
        reverse(nums, 0, nums.length);

    }

    public static void reverse(int[] nums, int i, int j){
        int temp;
        while (i < j - 1){
            temp = nums[i];
            nums[i] = nums[j - 1];
            nums[j - 1] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        reverse(nums, 0, 7);
//        System.out.println(Arrays.toString(nums));
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}

package LC;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/15.
 */
public class no561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int sum = 0;
        while (i < nums.length) {
            sum = sum + nums[i];
            i = i + 2;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4};
        System.out.println(arrayPairSum(array));
    }
}

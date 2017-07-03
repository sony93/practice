package LC;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/29.
 */
public class no66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }

            if(digits[0] == 0){
                int[] res = new int[digits.length + 1];//如此初始化，自动全部为0
                res[0] = 1;
                return res;
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = {9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}

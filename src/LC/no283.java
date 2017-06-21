package LC;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/16.
 */
public class no283 {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        for (int n = count; n < nums.length; n++){
            nums[n] = 0;
        }
    }

    /*第二次循环可以改成两个指针放在一个循环里,冒泡把0排出去*/

    public static void moveZeroes2(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i != count){
                    nums[count] = nums[i];
                    nums[i] = 0;
                }
                count++;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }
}

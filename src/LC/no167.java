package LC;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/23.
 */
public class no167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int first = 0;
        int last = numbers.length - 1;
        while (first < last){
            if(numbers[first] + numbers[last] > target)
                last--;
            else if(numbers[first] + numbers[last] < target)
                first++;
            else if(numbers[first] + numbers[last] == target) {
                index[0] = first + 1;
                index[1] = last + 1;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}

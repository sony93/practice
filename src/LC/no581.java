package LC;

import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/12.
 */
public class no581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int start, end;
        for(start = 0; start < temp.length; start++){
            if(nums[start] != temp[start])
                break;
        }
        for (end = temp.length - 1; end >= 0; end--){
            if(nums[end] != temp[end])
                break;
        }
        return start >= end ? 0 : end - start + 1;
    }

    public static int findUnsortedSubarray2(int[] nums){
        int n = nums.length;
        int max = nums[0];
        int min = nums[n - 1];
        int Toleft = -1;
        int Toright = -2;
        for(int i = 1; i < n; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if(max > nums[i])//从左向右若有比之前小的数，则记录其位置
                Toright = i;
            if(min < nums[n - 1 - i])//从右向左若有比之前大的数，则记录其位置
                Toleft = n - 1 - i;
        }
        return Toright - Toleft + 1;
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4};
        System.out.println(findUnsortedSubarray2(array));
    }
}

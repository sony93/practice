package LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */
public class no448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a = new ArrayList<>();
        if(nums.length == 0)
            return a;
        Arrays.sort(nums);
        int n = 1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == n)
                n++;
            else if(nums[i] > n){
                a.add(n);
                n++;
                i--;
            }
        }
        while (nums[nums.length - 1] < nums.length){
            a.add(nums[nums.length - 1] + 1);
            nums[nums.length - 1]++;
        }
        return a;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> a = new ArrayList<>();
        if(nums.length == 0)
            return a;
        int s;
        for (int i = 0; i < nums.length; i++){
            s = Math.abs(nums[i]) - 1;//nums[i]的值本该在的数组位置
            if(nums[s] > 0)
                nums[s] = -nums[s];
        }

        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                a.add(i + 1);
        }
        return a;
    }

    public static void main(String[] args){
        int[] a = {3,5,7,4,8,1,1,1};
        System.out.println(findDisappearedNumbers2(a));
    }
}

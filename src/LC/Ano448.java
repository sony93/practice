package LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */
public class Ano448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a = new ArrayList<>();
        Arrays.sort(nums);
        int n = 1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == n)
                n++;
            else if(nums[i] > n){
                a.add(n);
                n++;
            }
        }
        return a;
    }

    public static void main(String[] args){
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(a));
    }
}

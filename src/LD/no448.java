package LD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by sony on 16-11-14.
 */
public class no448 {
    public static void main(String args[]) {
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println(disappearnums(array));
    }

    public static List<Integer> disappearnums(int[] nums){
        List<Integer> set = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++){
            int value = nums[i] - 1;
            if(nums[value] > 0)
        }

    }
}

package LC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/27.
 */
public class no136 {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:nums){
            if(map.containsKey(i))
                map.put(i, 2);
            else
                map.put(i, 1);
        }

        for (int i: nums){
            if(map.get(i) == 1)
                return i;
        }
        return 0;
    }

    /**
     0 ^ N = N
     N ^ N = 0
     */

    public static int singleNumber2(int[] nums) {
        int flag = 0;
        for (int i:nums){
            flag = flag ^ i;
        }
        return flag;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,3,4};
        System.out.println(singleNumber2(nums));
    }
}

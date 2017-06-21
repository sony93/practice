package LC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/19.
 */
public class no594 {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
//            if(!map.containsKey(nums[i]))
//                map.put(nums[i], 1);
//            else {
            int value = map.getOrDefault(nums[i], 0);
            value++;
            map.put(nums[i], value);
        }
        int length = 0;
        for (int num: map.keySet()){
            if(map.containsKey(num + 1))
                length = Math.max(length, map.get(num) + map.get(num + 1));
        }

        return length;
    }

    public static void main(String[] args){
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}

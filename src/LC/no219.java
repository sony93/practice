package LC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/22.
 */
public class no219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 1, 4, 7, 5};
        System.out.println(containsNearbyDuplicate(nums, 4));
    }
}

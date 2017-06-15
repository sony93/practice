package LC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/14.
 */
public class no532 {
    public static int findPairs(int[] nums, int k){
        if(nums.length == 0 || k < 0)
            return 0;
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int num: nums){
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);//key:数组中的每个不同数字，value：数组中相同数的个数
        }
        int count = 0;
        Set<Map.Entry<Integer, Integer>> sets = hashmap.entrySet();
        for (Map.Entry<Integer, Integer> entry: sets){
            if(k == 0){
                if(entry.getValue() >= 2)
                    count++;
            }
            else {
                if(hashmap.containsKey(entry.getKey() + k))
                    count++;
            }
        }
        return count;
    }

    public static int findPairs2(int[] nums, int k){
        if(nums.length <= 0 || k < 0)
            return 0;
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = 1;
        while (right < nums.length){
            int a = nums[left];
            int b = nums[right];
            if(b - a < k)
                right++;
            else if(b - a > k)
                left++;
            else {
                count++;
                while (a < nums.length && nums[left] == a)
                    left++;
                while (b < nums.length && nums[right] == b)
                    right++;
            }
            if(left == right)
                right++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] a = {1, 1, 1, 2, 1};
        System.out.println(findPairs2(a, 1));
    }
}

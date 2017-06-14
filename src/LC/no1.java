package LC;

import java.util.HashMap;

/**
 * Created by sony on 17-2-23.
 */
public class no1 {
    public static void main(String[] args){
//        int[] result = new int[2];
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        System.out.println(twoSum(nums,target)[0] + "haha" + twoSum(nums,target)[1]);
//        guibing a= new guibing();
//        guibing.sort(nums, 0, nums.length - 1);
    }
    //hashtable 时间复杂度O(n) 空间复杂度O(n)
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }

        for (int i = 0;i < nums.length;i++){
            int other = target - nums[i];
            if (hashMap.containsKey(other) && hashMap.get(other) != i){
                result[0] = i;
                result[1] = hashMap.get(other);
            }
        }
        return result;
    }

}
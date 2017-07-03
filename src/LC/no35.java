package LC;

/**
 * Created by Administrator on 2017/6/30.
 */
public class no35 {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if(target == nums[i])
                return i;
            else if(target < nums[i])
                return i;
        }
        return nums.length;
    }

    //二分法，每次取中间的数字  log(n)
    public static int searchInsert2(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args){
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert2(nums, 5));
    }
}

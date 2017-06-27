package LC;

/**
 * Created by Administrator on 2017/6/23.
 */
public class no169 {
    public static int majorityElement(int[] nums) {
        int max = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if(count == 0){
                max = nums[i];
                count++;
            }
            else if(max == nums[i])
                count++;
            else {
                count--;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums = {6,5,5};
        System.out.println(majorityElement(nums));
    }
}

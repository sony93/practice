package LC;

/**
 * Created by Administrator on 2017/7/7.
 */
public class no453 {
    //转化为每次1个数减1，直到减成一样
    public static int minMoves(int[] nums) {
        int min = nums[0];
        int cha = 0;
        int ci = 0;
        for (int i = 1; i < nums.length; i++){
            if(min > nums[i]) {
                cha = min - nums[i];
                min = nums[i];
                ci += cha * i;
            }
            else {
                ci += nums[i] - min;
            }
        }
        return ci;
    }


    public static void main(String[] args){
        int[] nums = {3,2,1};
        System.out.println(minMoves(nums));
    }
}

package LC;

/**
 * Created by Administrator on 2017/6/29.
 */
public class no53 {
    //sum[i] = max{A[i], A[i] + sum[i+1]},必然跟A[i]有关系
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if(sum >= 0)
                sum = sum + nums[i];
            else
                sum = nums[i];
            if(sum > max_sum)
                max_sum = sum;
        }
        return max_sum;
    }
//a之前的数一定不是正数，否则可以把a~b更新为(a-1) ~ b。这说明a~b的起点一定是个正数。
//然后，假设a和b之间有个下标c，则必然有 a~ c > 0，否则可以扔掉a~c直接从c+1开始找。这说明
// 可以记录从a开始到当前数的和，如果这个和是负数就舍去，否则就不停地计算并且得到当前的最大值。
//    public static int maxSubArray2(int[] nums) {
//        int sum = 0;
//        int max_sum = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++){
//            if(sum < 0)
//                sum = 0;
//            sum += nums[i];
//            if(sum > max_sum)
//                max_sum = sum;
//        }
//        return max_sum;
//    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));


    }


}

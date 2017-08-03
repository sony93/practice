package LC;

/**
 * Created by Administrator on 2017/7/12.
 */
public class no367 {
    public static boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
        for (int i = 1; i <= num / 2; i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }
//二分法
    public static boolean isPerfectSquare2(int num) {
        if(num == 1)
            return true;
        long left = 0;
        long right = num / 2;
        while (left <= right){
            long mid = (left + right) / 2;
            if(mid * mid == num)
                return true;
            else if(mid * mid > num)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }

    public static void main(String[] args){
        int nums = 808201;
        System.out.println(isPerfectSquare2(nums));
    }

}

package LC;

import java.sql.SQLSyntaxErrorException;

/**
 * Created by Administrator on 2017/6/16.
 */
public class no268 {
    public static int missingNumber(int[] nums) {
        int total = 0;
        int total1 = 0;
        for(int i = 0; i < nums.length; i++){
            total = total + i;
            total1 = total1 + nums[i];
        }
        return total + nums.length - total1;
    }

    public static void main(String[] args){
        int nums[] = {0,1,3};
        System.out.println(missingNumber(nums));
    }
}

package LC;

/**
 * Created by sony on 16-11-13.
 */
public class no414 {
    public static void main(String[] args) {
        int[] array = {1,2,-2147483648};
        System.out.println(Third_Maximum_Number(array));
    }

    public static int Third_Maximum_Number(int[] nums) {
        int thirdmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int firstmax = Integer.MIN_VALUE;
        boolean flag = false;

        if (nums.length == 1) {
            thirdmax = nums[0];
        } else if (nums.length == 2) {
            if (nums[1] > nums[0])
                thirdmax = nums[1];
            else
                thirdmax = nums[1];
        } else {

            for (int i = 0; i < nums.length; i++) {
//                if(nums[i] == Integer.MIN_VALUE)
//                    flag = true;

                if (nums[i] > firstmax) {
                    thirdmax = secondmax;
                    secondmax = firstmax;
                    firstmax = nums[i];
                } else if (nums[i] < firstmax && nums[i] > secondmax) {
                    thirdmax = secondmax;
                    secondmax = nums[i];
                } else if (nums[i] < secondmax && nums[i] > thirdmax) {
                    thirdmax = nums[i];
                }
            }

        }
        if(thirdmax != Integer.MIN_VALUE)
            return thirdmax;
        else
            return firstmax;

    }
}

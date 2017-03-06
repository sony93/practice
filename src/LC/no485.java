package LC;

/**
 * Created by Administrator on 2017/2/28.
 */
public class no485 {
    public static void main(String[] args){
        int[] a = new int[]{1,1,0,1,1,1,0,0,1,1,0,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(a));
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int flag = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                flag++;
                if(max < flag)
                    max = flag;

            }
            else
                flag = 0;
        }
        return max;
    }
}

package LC;

/**
 * Created by Administrator on 2017/6/14.
 */
public class no26 {
    public static int removeDuplicates(int[] nums){
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        int temp = 0;
        int length = nums.length;
        for (int i = 1; i < length; i++){
            if(nums[i] != nums[temp]){
                temp++;
                nums[temp] = nums[i];
            }
        }
        return temp + 1;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,4,5,6,6};
        System.out.println(removeDuplicates(nums));
    }
}

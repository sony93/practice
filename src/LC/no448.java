//package LC;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by sony on 16-11-14.
// */
//public class no448 {
//    public static void main(String[] args) {
//        int[] Learn_algorithm.sort.array = {4,3,2,7,8,2,3,1};
//        System.out.println(disappearnums(Learn_algorithm.sort.array));
//    }
//
//    public static List<Integer> disappearnums(int[] nums){
//        List<Integer> set = new ArrayList<Integer>();
//        int flag = 0;
//        for (int i = 0; i < nums.length; i++){
//            if(nums[i] != nums[nums[i] - 1]){
//                flag = nums[i];
//                nums[i] =  nums[nums[i] - 1];
//                nums[nums[i] - 1] = flag;
//                i--;
//            }
//        }
//
//    }
//}

package LINT_code;

import java.util.*;

/**
 * Created by sony on 17-11-25.
 */
public class lint685 {
    public static int firstUniqueNumber(int[] nums, int number) {
        // Write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        boolean isFindStopNumber = false;
        for (int n:nums){

            Integer c = map.get(n);

            if(c == null){
                map.put(n, 1);
                list.add(n);
            }
            else {
                map.put(n, c + 1);
                list.remove(Integer.valueOf(n));//List<Integer>
            }
            System.out.println(n);
            if(n == number){
                isFindStopNumber = true;
                break;
            }
        }
        if(!isFindStopNumber || list.isEmpty()) return -1;
        else return list.get(0);
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 2, 1, 3, 4, 4, 5, 6};
        System.out.println(lint685.firstUniqueNumber(nums, 7));
    }
}

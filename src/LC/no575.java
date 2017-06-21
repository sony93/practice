package LC;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/6/20.
 */
public class no575 {
    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy: candies)
            set.add(candy);
        if(set.size() >= candies.length / 2)
            return candies.length / 2;
        else
            return set.size();
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(nums));
    }
}

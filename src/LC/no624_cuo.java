package LC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/19.
 */
public class no624_cuo {
    public static int maxDistance(List<List<Integer>> arrays) {
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int min = arrays.get(0).get(0);
        int buffer = Integer.MIN_VALUE;

        for (int i = 1; i < arrays.size(); i++){
            buffer = Math.max(buffer,  Math.abs(arrays.get(i).get(0) - max));
            buffer = Math.max(buffer, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1)) - min);
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
            min = Math.min(min, arrays.get(i).get(0));
        }
        return buffer;


    }

    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(-1);
        list1.add(1);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(-3);
        list2.add(1);
        list2.add(4);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(-2);
        list3.add(-1);
        list3.add(0);
        list3.add(2);
        List<List<Integer>> arrays = new ArrayList<List<Integer>>();
        arrays.add(list1);
        arrays.add(list2);
        arrays.add(list3);
        System.out.println(maxDistance(arrays));
    }
}

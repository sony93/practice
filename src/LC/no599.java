package LC;

import java.util.*;

/**
 * Created by Administrator on 2017/6/19.
 */
public class no599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> buffer = null;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++){
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++){
            map2.put(list2[i], i);
        }

        for (int i = 0; i < list1.length; i++){
            if(map2.containsKey(list1[i])){
                int sum = map1.get(list1[i]) + map2.get(list1[i]);
                if(sum < min){
                    min = sum;
                    buffer = new ArrayList<String>();
                    buffer.add(list1[i]);
                }
                else if(sum == min)
                    buffer.add(list1[i]);
            }
        }
        return buffer.toArray(new String[buffer.size()]);//arraylist和数组相互转化
    }

    public static void main(String[] args){
        String[] a = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] b = {"KFC", "Shogun", "Burger King"};
        System.out.println(Arrays.toString(findRestaurant(a, b)));
    }
}

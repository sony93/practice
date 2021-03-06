package LC;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sony on 18-1-4.
 */
public class no350 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i])+1);
            else
                map.put(nums1[i], 1);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
        int[] r = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
        {
            r[i] = result.get(i);
        }

        return r;
    }
}

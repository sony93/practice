package LC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sony on 18-1-5.
 */
public class no447 {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++){
            for (int j = 0; j < points.length; j++){
                if(i == j)
                    continue;
//                int d = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }

            for (int v : map.values()){
                count += v * (v - 1);
            }
            map.clear();
        }
        return count;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx*dx + dy*dy;
    }
}

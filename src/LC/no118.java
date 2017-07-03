package LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/6/27.
 */
public class no118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> array = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            if (i == 0) {
                row.add(1);
            }
            else if (i == 1) {
                row.add(1);
                row.add(1);
            }
            else if (i >= 2){
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i)
                        row.add(1);
                    else {
                        List<Integer> list = array.get(i - 1);
                        row.add(list.get(j - 1) + list.get(j));
                    }
                }
            }
            array.add(row);
        }
        return array;
    }

    public static void main(String[] args){
        System.out.println(generate(5));
    }
}

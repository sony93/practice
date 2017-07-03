package LC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/27.
 */
public class no119 {
    public static List<Integer> generate(int numRows) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < numRows + 1; i++){
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
                        row.add(array.get(j - 1) + array.get(j));
                    }
                }
            }
            array = row;
            if(i == numRows){
                return row;
            }
        }
        return null;
    }

    public static List<Integer> generate2(int numRows) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numRows + 1; i++){
            list.add(1);
            for (int j = i - 1; j > 0; j--){
//                System.out.println("j" + "=" + j);
//                System.out.println(list.get(j - 1) + "+" + list.get(j));
               list.set(j, list.get(j - 1) + list.get(j));//从后往前换，就不用考虑一个list下替换后的更新问题
            }
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(generate2(3));
    }
}

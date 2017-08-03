package LC;

/**
 * Created by Administrator on 2017/7/6.
 */
public class no598 {
    public static int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0)
            return m * n;
        int chang = Integer.MAX_VALUE;
        int kuan = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++){
            int[] array = ops[i];
            if(chang > array[0]) {
                chang = array[0];
            }
            if(kuan > array[1])
                kuan = array[1];
        }
        return chang * kuan;
    }

    public static void main(String[] args){
        int m = 3;
        int n = 3;
        int[][] ops = {{2,2}, {3,3}};
        System.out.println(maxCount(m, n, ops));
    }
}

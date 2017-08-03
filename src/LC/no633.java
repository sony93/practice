package LC;

/**
 * Created by Administrator on 2017/7/5.
 */
public class no633 {
    public static boolean judgeSquareSum(int c) {
        int start = 0;
        int end = (int) Math.sqrt(c);
        while (start <= end){
            int real = start * start + end * end;
            if (real < c)
                start++;
            else if (real > c)
                end--;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        int a = 5;
        System.out.println(judgeSquareSum(a));
    }
}

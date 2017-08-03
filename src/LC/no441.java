package LC;

/**
 * Created by Administrator on 2017/7/7.
 */
public class no441 {
    public static int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }

    public static void main(String[] args){
        System.out.println(arrangeCoins(5));
    }


}

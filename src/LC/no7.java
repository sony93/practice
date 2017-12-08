package LC;

/**
 * Created by sony on 17-12-7.
 */
public class no7 {
    public static int reverse(int x) {
        long tmp = 0;
        long res = 0;

        while(x!=0) {
            tmp = x % 10;
            x /= 10;
            res = res * 10 + tmp;
        }
        if(res<=Integer.MIN_VALUE || res>=Integer.MAX_VALUE) return 0;
        return (int)res;
    }

    public static void main(String[] args){
        int x = -2147483648;
        System.out.println(reverse(x));
    }
}

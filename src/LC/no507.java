package LC;

/**
 * Created by Administrator on 2017/7/6.
 */
public class no507 {
    public static boolean checkPerfectNumber(int num) {
        if(num == 1)
            return false;
        int n = 1;
        for (int i = 2; i <= (int) Math.sqrt(num); i++){
            if(num % i == 0){
                n += i + num/i;
                if(n > num)
                    return false;
            }
        }
        if(n != num)
            return false;
        else
            return true;
    }

    public static void main(String[] args){
        int num = 1;
        System.out.println(checkPerfectNumber(num));
    }
}

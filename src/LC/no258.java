package LC;

/**
 * Created by sony on 18-1-8.
 */
public class no258 {
    public static int addDigits(int num) {
        while (num / 10 != 0){
            int tmp = 0;
            while (num / 10 != 0){
                tmp += num % 10;
                num = num / 10;
            }
            num += tmp;
        }

        return num;
    }

    public static int addDigits2(int num) {
        if(num == 0)
            return 0;
        else if(num % 9 == 0)
            return 9;
        else {
            return num % 9;
        }
    }

    public static void main(String[] args){
        System.out.println(addDigits(128));
    }
}

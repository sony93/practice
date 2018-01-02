package LC;

/**
 * Created by sony on 18-1-2.
 */
public class no504 {
    public static String convertToBase7(int num) {
        StringBuilder s = new StringBuilder();
        int f = 1;
        if(num < 0) {
            num = Math.abs(num);
            f = 0;
        }
        int flag = 1;
        while (flag != 0){
            flag = num / 7;
            int yu = num % 7;
            s.append(yu);
            num = flag;
        }
        if(f == 0)
            s.append("-");

        return s.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(convertToBase7(100));
    }
}

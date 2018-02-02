package LC;

/**
 * Created by sony on 18-1-24.
 */
public class no263 {
    public static boolean isUgly(int num) {
        for (int i = 2; i < 6 && num>0; i++){
            while (num % i == 0)
                num /= i;
        }
        return num == 1;
    }

    public static void main(String[] args){
        System.out.println(isUgly(14));
    }
}

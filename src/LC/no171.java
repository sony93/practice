package LC;

/**
 * Created by sony on 18-1-8.
 */
public class no171 {
    public static int titleToNumber(String s) {
        int count = 0;
        int flag = 1;
        for (int i = s.length() - 1; i >= 0; i--){
            count += ((s.charAt(i) - 'A') + 1) * flag;
            flag *= 26;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(titleToNumber("AB"));
    }
}

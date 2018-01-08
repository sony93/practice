package LC;

/**
 * Created by sony on 18-1-5.
 */
public class no400 {
    public static int findNthDigit(int n) {
        int flag_length = 1;
        long count = 9;
        int start = 1;
        while (n > flag_length * count){
            n -= flag_length * count;
            flag_length += 1;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / flag_length;
        String aim = Integer.toString(start);
        return Character.getNumericValue(aim.charAt((n - 1) % flag_length));
    }

    public static void main(String[] args){
        System.out.println(findNthDigit(5));
    }
}

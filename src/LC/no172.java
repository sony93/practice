package LC;

/**
 * Created by sony on 18-1-8.
 */
public class no172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0){
        n /= 5;
        count += n;
        }
        return count;
    }
}

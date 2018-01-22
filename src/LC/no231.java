package LC;

/**
 * Created by sony on 18-1-19.
 */

//8 (100)2  16 (1000)2
public class no231 {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        return (n & (n - 1)) == 0;
    }
}

package LC;

/**
 * Created by sony on 18-1-22.
 */
public class no461 {
    public int hammingDistance(int x, int y) {
        int xory = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++){
            if((xory & 1) == 1)
                count++;
            xory >>= 1;
        }
        return count;
    }
}

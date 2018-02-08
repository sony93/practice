package LC;

/**
 * Created by sony on 18-2-6.
 */
public class no458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        while (Math.pow((minutesToTest / minutesToDie + 1), pigs) < buckets)
            pigs++;
        return pigs;

    }
}

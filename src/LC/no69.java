package LC;

/**
 * Created by sony on 18-1-5.
 */
public class no69 {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        int left = 1;
        int right = Integer.MAX_VALUE;

        while (true){
            int mid = left + (right - left)/2;
            if(mid > x / mid)
                right = mid - 1;
            else{
                if(mid + 1 > x / (mid + 1))
                    return mid;
                else
                    left = mid + 1;
            }
        }
    }

    public int mySqrt2(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left)/2;

            if (mid > x/mid) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans ;
    }
}

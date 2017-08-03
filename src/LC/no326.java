package LC;

/**
 * Created by Administrator on 2017/7/12.
 */
public class no326 {
    //任何一个3的x次方一定能被int型里最大的3的x次方整除
    // 1162261467 is 3^19,  3^20 is bigger than int
    public boolean isPowerOfThree(int n) {
        return ( n>0 &&  1162261467%n==0);
    }
}

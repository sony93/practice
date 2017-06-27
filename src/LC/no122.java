package LC;

/**
 * Created by Administrator on 2017/6/26.
 */
public class no122 {
    public static int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int a = prices[prices.length - 1];
        int pro = 0;
        for (int i = prices.length - 2; i >= 0; i--){
            if(prices[i] < a){
                pro += a - prices[i];
                a = prices[i];
            }
            else {
                a = prices[i];
            }
        }
        return pro;
    }

    public static void main(String[] args){
        int[] nums = {5,6,7,1,2,3,4};
        System.out.println(maxProfit(nums));
    }
}

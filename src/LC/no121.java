package LC;

/**
 * Created by Administrator on 2017/6/26.
 */
public class no121 {
    public static int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pro = 0;

        for (int i = 0; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
                max = Integer.MIN_VALUE;
            }
            if(max < prices[i])
                max = prices[i];
            if(max - min > pro)
                pro = max - min;

        }
        return pro;
    }

    public static void main(String[] args){
        int[] nums = {2,4,1};
        System.out.println(maxProfit(nums));
    }
}

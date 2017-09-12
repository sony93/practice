package jiu_zhang.dynamic_plan;

/**
 * Created by Administrator on 2017/9/8.
 */
public class lin {
    public static void main(String[] args){
        int n = 4;
        int ans = 0;
        int k;
        int k1;
        ans += n;
        ans += n * n;
        for (int i = 2; i < n; i++) {
            ans += n;
            k = 2;
            while (jiecheng(i, k) <= n) {
                k1 = 1;
                while (k * k1 <= n) {
                    ans += 2;
                    k1++;
                }
                k++;
            }
        }
        System.out.println(ans);
    }

    public static int jiecheng(int n, int k){
        int sum = 1;
        for (int i = 0; i < k; i++){
            sum = sum * n;
        }
        return sum;
    }
}

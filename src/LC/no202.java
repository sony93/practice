package LC;

import java.util.HashSet;

/**
 * Created by Administrator on 2017/9/6.
 */
public class no202 {
    public static boolean isHappy(int n) {
        if(n < 1)
            return false;
        int temp;
        int newNum;
        HashSet<Integer> hashSet = new HashSet<>();
        while (n != 1 && !hashSet.contains(n)){
            hashSet.add(n);
            newNum = 0;
            while (n > 0){
                temp = n % 10;
                n /= 10;
                newNum += temp * temp;
            }
            n = newNum;
        }
        return n == 1;
    }

    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }
}

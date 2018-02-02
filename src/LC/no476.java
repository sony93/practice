package LC;

/**
 * Created by sony on 18-1-23.
 */
public class no476 {
    public int findComplement(int num) {
        int flag = 0;
        int count = 0;
        while (flag < num){
            flag += Math.pow(2, count);
            count++;
        }
        return flag - num;
    }
}

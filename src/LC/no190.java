package LC;

/**
 * Created by sony on 18-2-6.
 */
public class no190 {
    public static int reverseBits(int n) {
        int num = 0;
        for (int i = 0; i < 32; i++){
            if((n & 1) == 1){
                num = (num << 1) + 1; // 左移动
                n >>= 1;
            }
            else {
                num = num << 1;
                n >>= 1;
            }
        }
        return num;
    }

    public static void main(String[] args){
        System.out.println(reverseBits(6));
    }
}

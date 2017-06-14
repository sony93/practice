package LC;

/**
 * Created by Administrator on 2017/6/12.
 */
public class no605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n ){
        int count = 0;
        int flag = 1;
        for (int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0) {
                flag++;
                if((flag == 2) && (i == flowerbed.length - 1)){
                    count++;
                    if(count >= n)
                        return true;
                }
                if(flag == 3) {
                    count++;
                    if(count >= n)
                        return true;
                    flag = 1;
                }
            }
            else {
                flag = 0;
            }
        }
        if(count >= n)
            return true;
        else {
            System.out.println("最大:"+ count);
            return false;
        }
    }

    public static void main(String[] args){
        int[] flowerbed = {1,0,0,0,1};
        int n = 8;
        canPlaceFlowers(flowerbed, n);
    }
}

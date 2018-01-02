package LC;

/**
 * Created by Administrator on 2018/1/1.
 */
public class no492 {
    public static int[] constructRectangle(int area) {
        if(area == 1)
            return new int[]{1,1};
        int jia = Integer.MAX_VALUE;
        int chang = Integer.MAX_VALUE;
        int kuan = Integer.MIN_VALUE;
        for (int i = 1; i <= Math.sqrt(area); i++){
            if(area % i == 0){
                kuan = i;
                chang = area / i;
            }
            if(jia > chang - kuan)
                jia = chang - kuan;
        }
        return new int[]{chang, kuan};
    }

    public static void main(String[] args){
        int area = 4;
        System.out.println(constructRectangle(area)[0]);
    }
}

package the_method_of_programming;

import sort.GuiBing;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/6.
 */
public class no1_2 {
    public static void main(String[] args){
        int[] a = {7, 3, 12, 5, 9, 6, 16, 1, 2};
        int[] b = {3, 2, 1, 12, 10};

        GuiBing guiBing = new GuiBing();
        guiBing.sort(a, 0, a.length - 1);
        guiBing.sort(b, 0, b.length - 1);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(StringContain(a, b));


    }

    public static boolean StringContain(int[] a, int[] b){
        for(int pa = 0, pb = 0; pb < b.length - 1;){ //轮询比较
            while (a[pa] < b[pb] && pa < a.length){
                pa++;
            }
            if(pa >= a.length || (a[pa] > b[pb])){
                return false;
            }
            pb++;
        }
        return true;
    }

//    public static boolean StringContain2(int[] a, int[] b){
//
//    }

}

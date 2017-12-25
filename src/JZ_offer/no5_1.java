package JZ_offer;

/**
 * Created by sony on 17-12-12.
 */

import java.util.Arrays;

/**
有两个排序数组A1和A2，内存在A1的末尾有足够多的空余空间容纳A2，实现一个函数，把A2
插入到A1，并且是有序的。
*/
public class no5_1 {
    public static int[] insertSortedArrays(int[] array1,int[] array2){
        int a = array1.length - 1;
        int b = array2.length - 1;
        int[] temp = new int[a + b + 2];
        int c = temp.length - 1;
        while (a >= 0 && b >= 0){
            if(array1[a] >= array2[b]){
                temp[c--] = array1[a];
                a--;
            }
            else {
                temp[c--] = array2[b];
                b--;
            }
        }

        while (a >= 0){
            temp[c--] = array1[a--];
        }
        while (b >= 0){
            temp[c--] = array1[b--];
        }
        return temp;
    }

    public static void main(String[] args){
        int[] a = {1,4,7,9,11};
        int[] b = {2,5,7,14};
        System.out.println(Arrays.toString(insertSortedArrays(a, b)));
    }
}

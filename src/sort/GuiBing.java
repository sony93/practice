package sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/6.
 */
public class GuiBing {
    public static void merge(int[] array, int low, int mid, int high){
        int i = low;//左
        int j = mid + 1;//右


        int[] arraybuffer = new int[high - low + 1];
        int k = 0;//buffer的指针
        //进行两个数据的合并
        while (i <= mid && j <= high){
            if(array[i] <= array[j])
                arraybuffer[k++] = array[i++];
            else
                arraybuffer[k++] = array[j++];
        }

        while (i <= mid)
            arraybuffer[k++] = array[i++];

        while (j <= high)
            arraybuffer[k++] = array[j++];

        for (int k2 = 0; k2 < arraybuffer.length; k2++){
            array[low + k2] = arraybuffer[k2];
        }

    }

    public static int[] sort(int[] array, int low, int high){
        int mid = (low + high) / 2;
        if(low < high){
            sort(array, low, mid);//递归执行，直到分成单个
            sort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
        return array;
    }

    public static void main(String[] args){
        int[] array = {2,3,9,4,1,8,6};
        sort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}

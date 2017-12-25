package JZ_offer;

/**
 * Created by sony on 17-12-12.
 */

/**
 * 一维数组查找重复数字
 * 题目：在一个长度为n的数组里得所有数字都在0~n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请判断。例如，输入长度为7的数组{2,3,1,0,2,5,3}那么对应的输出是重复的数字2或者3
 思路：如果数组中没有重复数字，则经过排序后的数组的第i个应该为i。（会修改原始数据）

 */
public class no3 {
    public static int getDuplication(int[] data){//改变数组结构
        if(data==null || data.length<2)
            return -1;
        for(int i=0;i<data.length;i++){
            while(data[i]!=i){
                if(data[i]==data[data[i]])
                    return data[i];
                else{
                    int temp = data[i];
                    data[i] = data[data[i]];
                    data[data[i]] = temp;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {0,1,2,3,4,4};
        System.out.println(getDuplication(a));
    }
}

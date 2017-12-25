package JZ_offer;

/**
 * Created by sony on 17-12-7.
 */

/**
 * 二维数组查找
 * 杨氏矩阵：每一行自左向右递增，每一列自上向下递增。

 题目：输入一个杨氏矩阵和一个整数，判断这个数是在杨氏矩阵中出现。

 思路：因为每行是递增的，每列也是递增的，我们可以将这个数与最右上（左下）角的元素进行比较。
 */
public class no4 {
    public static boolean FindInPartiallySortedMatrix(int[][] array, int target){
        if (array == null)
            return false;

        int hang = array.length;
        int lie = array[0].length;
        int i = 0;
        int j = lie - 1;
        while (i < hang && j >= 0){
            if(array[i][j] == target)
                return true;
            else if (array[i][j] > target)
                j--;
            else if(array[i][j] < target)
                i++;
        }
        return false;
    }
}

package LC;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/13.
 */
public class no566 {
    public static int[][] matrixReshape(int[][] nums, int r, int c){
        int hang = nums.length;
        int lie = nums[0].length;
        int hang_buffer = 0;
        int lie_buffer = 0;
        int[][] array = new int[r][c];
        if(hang * lie != r * c){
            return nums;
        }
        for (int i = 0; i < r; i++){
            for(int n = 0; n < c; n++){
                array[i][n] = nums[hang_buffer][lie_buffer++];
                if(lie_buffer >= lie){
                    hang_buffer++;
                    lie_buffer = 0;
                }
            }
        }
        return array;
    }

    public static int[][] matrixReshape2(int[][] nums, int r, int c) {
        int hang = nums.length;
        int lie = nums[0].length;
        int total = hang * lie;
        if (total != r * c) {
            return nums;
        }
        int[][] array = new int[r][c];
        for (int i = 0; i < total; i++){
            array[i / c][i % c] = nums[i / lie][i % lie];
        }
        return array;
    }

    public static void main(String[] args){
        int[][] nums = {{1,2},{3,4}};
        int[][] array = matrixReshape2(nums, 1, 4);
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

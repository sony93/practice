package LC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/21.
 */
public class no463 {
    public static int islandPerimeter(int[][] grid) {
        int cellofone = 0;
        int bisideofone = 0;
        for (int i = 0; i < grid.length; i++){//只需要查一个单元格的左和上即可
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 1)
                    continue;
                cellofone++;
                if(i != 0 && grid[i - 1][j] != 0)
                    bisideofone++;
                if(j != 0 && grid[i][j - 1] != 0)
                    bisideofone++;
            }
        }
        return cellofone * 4 - bisideofone * 2;
    }

    public static void main(String[] args){
        int[][] nums = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(nums));
    }
}

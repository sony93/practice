package jiu_zhang.dynamic_plan;
//动态规划（数字三角形）
/**
 * Created by Administrator on 2017/9/4.
 */
public class lint_109 {
    public static int[][] hash;
//记忆化搜索
    public static int minimumTotal1(int[][] triangle) {
        // write your code here
        int n = triangle.length;
        int m = triangle[n - 1].length;
        //记录从x,y出发走到最底层所能找到的最小路径
        hash = new int[n][m];
        return dfs(0, 0, n, triangle);
    }
//记忆化搜索
    public static int dfs(int x, int y, int n, int[][] triangle){
        if(x == n){
            return 0;
        }
        else {
//            System.out.println(x + " " + y);
            if (hash[x][y] != 0) {
                return hash[x][y];
            }
            int left = dfs(x + 1, y, n, triangle);
            int right = dfs(x + 1, y + 1, n, triangle);
            hash[x][y] = min(left, right) + triangle[x][y];
            return hash[x][y];
        }
    }

    public static int min(int x, int y){
        return (x >= y) ? y : x;
    }

    //自底向上的动态规划
    public static int minimumTotal2(int[][] triangle) {
        int n = triangle.length;
        int m = triangle[n - 1].length;
        //表示从（n,m）出发走到最后一层的最小路径
        hash = new int[n][m];
        //初始化，终点先有值
        for (int i = 0; i < m; i++){
            hash[n - 1][i] = triangle[n - 1][i];
        }

        for (int i = n - 2; i >=0; i--){
            for (int j = 0; j <= i; j++){
                hash[i][j] = Math.min(hash[i + 1][j], hash[i + 1][j + 1]) + triangle[i][j];
            }
        }
        return hash[0][0];
    }

    //自顶向下的动态规划
    public static int minimumTotal3(int[][] triangle) {
        int n = triangle.length;
        int m = triangle[n - 1].length;
        //表示从（0,0）出发走到(n,m)的最小路径
        hash = new int[n][m];
        hash[0][0] = triangle[0][0];
        for (int i = 1; i < n; i++){
            for (int j =0; j <= i; j++){
                int flag = 0;
//                System.out.println(i + " " + j);
                if(i - 1 >= 0 && j <= i - 1) {
                    hash[i][j] = hash[i - 1][j];
                    flag = 1;
                }
                if(i - 1 >= 0 && j - 1 >= 0 && flag == 1)
                    hash[i][j] = Math.min(hash[i][j], hash[i - 1][j - 1]);
                else if(i - 1 >= 0 && j - 1 >= 0 && flag == 0){
                    hash[i][j] = hash[i - 1][j - 1];
                }
                hash[i][j] = hash[i][j] + triangle[i][j];
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            min = Math.min(min, hash[n - 1][i]);
        }
        return min;
    }

    public static void main(String[] args){
        int traingle[][];
        traingle = new int[4][];

        traingle[0] = new int[1];
        traingle[1] = new int[2];
        traingle[2] = new int[3];
        traingle[3] = new int[4];

        traingle[0][0] = 2;
        traingle[1][0] = 3;
        traingle[1][1] = 4;
        traingle[2][0] = 6;
        traingle[2][1] = 5;
        traingle[2][2] = 7;
        traingle[3][0] = 4;
        traingle[3][1] = 1;
        traingle[3][2] = 8;
        traingle[3][3] = 3;

        System.out.println(minimumTotal3(traingle));

    }
}

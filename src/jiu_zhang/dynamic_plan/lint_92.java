package jiu_zhang.dynamic_plan;

/**
 * Created by sony on 17-9-13.
 */
public class lint_92 {
    public static int backPack(int m, int[] A) {
        // write your code here
        //f[i][j]前i个能否取出和为j的
        boolean[][] f = new boolean[A.length + 1][m + 1];
        for (int i = 0; i <= A.length; i++){
            for (int j = 0; j <= m; j++){
                f[i][j] = false;
            }
        }

        for (int i = 0; i <= A.length; i++){
            f[i][0] = true;
        }

        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= m; j++) {
                if(j - A[i - 1] >= 0 && f[i -1][j - A[i - 1]] == true)
                    f[i][j] = true;
                else if(f[i - 1][j] == true)
                    f[i][j] = true;
                else
                    f[i][j] = false;
            }
        }

        int max = 0;
        for (int j = 0; j<= m; j++){
            if(f[A.length][j] ==true)
                max = j;
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 5, 7};
        int total = 12;
        System.out.println(backPack(total, nums));
    }
}

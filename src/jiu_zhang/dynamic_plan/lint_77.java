package jiu_zhang.dynamic_plan;

/**
 * Created by Administrator on 2017/9/11.
 */
public class lint_77 {
    //Subsequence可以不连续
    public static int longestCommonSubsequence(String A, String B) {
        // write your code here
        int m = A.length();
        int n = B.length();
        int[][] f = new int[m + 1][n + 1];

//        for (int i = 0; i < m; i++){
//            f[i][0] = 0;
//        }
        for (int i = 1; i < m + 1; i++){
            for (int j = 1; j < n + 1; j++){
                if(A.charAt(i - 1) == B.charAt(j - 1))
                    f[i][j] = f[i - 1][j - 1] + 1;
                else
                    f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
            }
        }

        return f[m][n];
    }

    public static void main(String[] args){
        String string1 = "ABCD";
        String string2 = "EDCA";
        System.out.println(longestCommonSubsequence(string1, string2));
    }
}

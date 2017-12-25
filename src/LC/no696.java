package LC;

/**
 * Created by Administrator on 2017/12/25.
 */
public class no696 {
    public static int countBinarySubstrings(String s) {
        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1; i < s.length(); i++){
            if(s.charAt(i - 1) != s.charAt(i))
                groups[++t] = 1;
            else
                groups[t]++;
        }

        int count = 0;
        for (int i = 1; i <= t; i++){
            count += Math.min(groups[i - 1], groups[i]);
        }
        return count;
    }

    public static void main(String[] args){
        String s = "00110";
        System.out.println(countBinarySubstrings(s));
    }
}

package LC;

import java.util.Arrays;

public class no556 {
    public static int nextGreaterElement(int n) {
        String s = n + "";
        char[] sb = s.toCharArray();
        int j = s.length() - 1;
        while (j > 0) {
            if (sb[j] > sb[j - 1])
                break;
            j--;
        }
        if (j == 0)
            return -1;
        for (int i = s.length() - 1; i >= j; i--){
            if(sb[i] > sb[j - 1]){
                char tmp = sb[i];
                sb[i] = sb[j - 1];
                sb[j - 1] = tmp;
                break;
            }
        }
        Arrays.sort(sb, j, s.length());
        long val = Long.parseLong(new String(sb));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;

    }

    public static void main(String[] args){
        System.out.println(nextGreaterElement(12));
    }
}

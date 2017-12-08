package LC;

/**
 * Created by sony on 17-12-7.
 */
public class no38 {
    public static String countAndSay(int n) {
        if(n == 1)
            return "1";

        String str = countAndSay(n - 1) + "*";
        char[] c = str.toCharArray();
        int count = 1;
        String s = "";
        for (int i = 0; i < c.length - 1; i++){
            if(c[i] == c[i + 1])
                count++;
            else {
                s = s + count + c[i];
                count = 1;
            }
        }
        return s;
    }

    public static String countAndSay2(int n) {
        String result = "1";
        for (int i = 1; i < n; i++){
            String pre = result + "*";
            char[] p = pre.toCharArray();
            int count = 1;
            result = "";
            for (int j = 0; j < p.length - 1; j++){
                if(p[j] == p[j + 1])
                    count++;
                else {
                    result = result + count + p[j];
                    count = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(countAndSay2(4));
    }
}

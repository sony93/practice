package LC;

/**
 * Created by Administrator on 2017/7/17.
 */
public class no459 {
    public static boolean repeatedSubstringPattern(String s) {
        boolean result = false;
        for (int i = s.length() / 2; i >= 1; i--){//子字符串长度
            if(s.length() % i != 0)
                continue;
            String regex = s.substring(0, i);
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<s.length() / i;j++) {
                sb.append(regex);
            }
            if(sb.toString().equals(s))
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        String a = "aba";
        System.out.println(repeatedSubstringPattern(a));
    }
}

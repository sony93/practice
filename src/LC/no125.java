package LC;

/**
 * Created by sony on 17-12-19.
 */
public class no125 {
    public static boolean isPalindrome(String s) {
        if(s == null)
            return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            char a = s.charAt(i);
            while((a < '0' || a > '9') && (a < 'A' || a > 'Z') && (a < 'a' || a > 'z')) {
                if(i >= j)
                    break;
                i++;
                a = s.charAt(i);
            }
            char b = s.charAt(j);
            while((b < '0' || b > '9') && (b < 'A' || b > 'Z') && (b < 'a' || b > 'z')) {
                if(i >= j)
                    break;
                j--;
                b = s.charAt(j);
            }
            if(Character.toLowerCase(a) != Character.toLowerCase(b))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "aa";
        System.out.println(isPalindrome(s));
    }
}

package LC;

/**
 * Created by sony on 17-12-6.
 */
public class no28 {
    public static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
            return -1;
        else if(needle.length() == 0)
            return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.substring(i, i + needle.length()).equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        String a = "mississippi";
        String b = "issip";
        System.out.println(strStr(a, b));
    }
}

package LC;

/**
 * Created by sony on 18-1-23.
 */
public class no541 {
    public static String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k){
            for (int left = i , right = Math.min(i + k - 1, a.length - 1); left < right; left++, right--){
                char tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
            }
        }
        return new String(a);
    }

    public static void main(String[] args){
        System.out.println(reverseStr("abcde", 2));

    }
}

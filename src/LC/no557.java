package LC;

/**
 * Created by sony on 18-1-24.
 */
public class no557 {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length; i++){
            sb.append(new StringBuffer(a[i]).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }

    public String reverse(String s) {
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            res.insert(0,s.charAt(i));
        return res.toString();
    }
}

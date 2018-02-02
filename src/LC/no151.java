package LC;

/**
 * Created by sony on 18-1-23.
 */
public class no151 {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuffer buf = new StringBuffer();
        for (int i = words.length - 1; i > 0; i--){
            buf.append(words[i] + " ");
        }
        return buf.toString() + words[0];
    }

    public static void main(String[] args){
        System.out.println(reverseWords(""));
    }
}

package LC;

/**
 * Created by Administrator on 2017/7/31.
 */
public class no344 {
    public static String reverseString(String s) {
        char[] word = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++){
            char buffer;
            buffer = word[i];
            word[i] = word[s.length() - 1 - i];
            word[s.length() - 1 - i] = buffer;
        }
        return String.valueOf(word);
    }

    public static void main(String[] args){
        String s = "hello";
        System.out.println(reverseString(s));
    }

}

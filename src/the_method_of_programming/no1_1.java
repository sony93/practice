package the_method_of_programming;

/**
 * Created by Administrator on 2017/3/5.
 */
public class no1_1 {
    public static String ReverseString(String s, int from, int to){
        char[] str = s.toCharArray();
        while (from < to){
            char buffer = str[to];
            str[to] = str[from];
            str[from] = buffer;
            from++;
            to--;
        }
        return String.valueOf(str);
    }

    public static void main(String[] args){
        String s = "abcdef";
        ReverseString(s, 0, 2);
        ReverseString(s, 3, 5);
        ReverseString(s, 0, 5);
        System.out.println(s);
        String[] s2 = "i am a student.".split(" ");
        for (int i =0; i < s2.length; i++){
            s2[i] = ReverseString(s2[i], 0, s2[i].length() - 1).toString();
            System.out.println(s2[i]);
        }
        String s3 = String.join(" ", s2);
        s3 = ReverseString(s3, 0, s3.length() - 1);
        System.out.print(s3);

    }
}

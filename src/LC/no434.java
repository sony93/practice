package LC;

/**
 * Created by Administrator on 2017/7/31.
 */
public class no434 {
    public static int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String s = "";
        System.out.println(countSegments(s));
    }
}

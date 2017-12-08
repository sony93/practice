package JZ_offer;

/**
 * Created by sony on 17-12-7.
 */
public class no4 {
    public static String replaceSpace(StringBuffer str) {
        int a = str.length();
        int space_num = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ')
                space_num++;
        }
        int pre_last = a - 1;
        int newlength = str.length() + space_num * 2;
        str.setLength(newlength);
        int now_last = str.length() - 1;
        while (pre_last >= 0 && pre_last < now_last){
            if(str.charAt(pre_last) == ' '){
                str.setCharAt(now_last--, '0');
                str.setCharAt(now_last--, '2');
                str.setCharAt(now_last--, '%');
                pre_last--;
            }
            else {
                str.setCharAt(now_last--, str.charAt(pre_last--));
            }
        }
        return str.toString();
    }

    public static void main(String[] args){
        StringBuffer a = new StringBuffer("hello world");
        System.out.println(replaceSpace(a));
    }
}

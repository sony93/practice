package JZ_offer;

/**
 * Created by sony on 17-12-7.
 */

/**
 * 替换空格
 * 题目：请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 思路：计算替换前和替换后的字符串长度，从后先前遍历，来减少字符的移动次数。同理，当把两个数组(字符串)和并入一个时，从后向前比较合并能够减少移动次数
 */
public class no5 {
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

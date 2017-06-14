package the_method_of_programming;

/**
 * Created by Administrator on 2017/3/14.
 */
/*
字符串的包含
如果两个字符串的字符一样，出现次数也一样，则认为这两个字符串是兄弟字符串。
例如，“bad”和“abd”即为兄弟字符串。现提供一个字符串，在字典中快速找到他的兄弟字符串得个数
*/

public class no1_2_test {
    //判断是否是兄弟字符串
    public static boolean IsBrother(String a, String b, int start, int end){ //hash数组对应每一个字母
        int[] hash = new int[58];
        if(start > end)
            return false;
        else {
            for (int i = 0; i < end - start +1; i++){
                ++hash[a.charAt(i) - 'A'];
                --hash[b.charAt(start + i) - 'A'];
            }
            for (int i = 0; i < 2 *26; i++){
                if(hash[i] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int FindBrother(String a, String b){
        int start = 0;
        int num = 0;
        while (start + a.length() <= b.length()){
            if(IsBrother(a, b, start, start + a.length() - 1)){
                num++;
                System.out.println(b.substring(start, start + a.length()));            }
            start++;
        }
        return num;
    }

    public static void main(String[] args){
        String a = "abc";
        String b = "abcsdasdfasgagafgafcbagasfbcagSDfaaeabc";
        int num = FindBrother(a, b);
        System.out.println(num);
    }
}

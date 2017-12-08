package LC;

/**
 * Created by sony on 17-12-8.
 */
public class no67 {
    public static String addBinary(String a, String b) {
        StringBuffer add = new StringBuffer();
        int flag = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || flag == 1){
            int A = i < 0 ? 0 : a.charAt(i--) - '0';//对齐位置a的值
            int B = j < 0 ? 0 : b.charAt(j--) - '0';
            add.insert(0,(A + B + flag) % 2);
            flag = (A + B + flag) / 2;
        }
        return add.toString();
    }

    public static void main(String[] args){
        System.out.println(addBinary("11","1"));
    }
}

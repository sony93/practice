package LC;

/**
 * Created by Administrator on 2017/7/10.
 */

//67
public class no415 {
    public static String addStrings(String num1, String num2) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int jinwei = 0;
        while (i >= 0 || j >= 0){
            int sum = jinwei;
            if(i >= 0) {
                sum += num1.charAt(i--) - '0';//减去'0'得到改数字的真值
            }
            if(j >= 0)
                sum += num2.charAt(j--) - '0';
            stringBuffer.append(sum % 10);
            jinwei = sum / 10;
        }
        if(jinwei == 1)
            stringBuffer.append(jinwei);//在后面添加
        return stringBuffer.length() == 0 ? "0" : stringBuffer.reverse().toString();
    }

    public static void main(String[] args){
        String num1 = "12";
        String num2 = "25";
        System.out.println(addStrings(num1, num2));
    }
}

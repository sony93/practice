package LC;

/**
 * Created by Administrator on 2017/7/21.
 */
public class no14 {
    public static String longestCommonPrefix(String[] strs) {//竖着比
        if(strs == null || strs.length == 0)
            return "";
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public static void main(String[] args){
        String[] str = {"abcdefg", "abcdefghijk", "abcdfghijk", "abcef"};
        System.out.println(longestCommonPrefix(str));
    }
}

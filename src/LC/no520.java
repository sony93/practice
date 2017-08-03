package LC;

/**
 * Created by Administrator on 2017/7/11.
 */
public class no520 {
    public static boolean detectCapitalUse(String word) {
        if(word.length() <= 1)
            return true;
        int flag;
        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && word.charAt(1) >= 'a' && word.charAt(1) <= 'z'){
            flag = 2;
        }
        else if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            flag = 1;
        }
        else
            flag = 0;
        for (int i = 1; i < word.length(); i++){
            if(flag == 0){
                if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                    return false;
            }
            if(flag == 1){
                if(!(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')){
                    return false;
                }
            }
            if(flag == 2){
                if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String a = "UUUUUUa";
        System.out.println(detectCapitalUse(a));
    }
}

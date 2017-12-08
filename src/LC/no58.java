package LC;

/**
 * Created by sony on 17-12-8.
 */
public class no58 {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int pre_count = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                count++;
                flag = false;
            }

            else {
                if(flag == false){
                    flag = true;
                    pre_count = count;
                    count = 0;
                }
                else
                    count = 0;

            }
        }
        if(count == 0 && pre_count == 0)
            return 0;
        else if(count == 0 && pre_count != 0)
            return pre_count;
        return count;
    }


}

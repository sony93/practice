package LL;

/**
 * Created by sony on 16-11-10.
 */
public class ex4 {
    public static void main(String[] args){
        String s = "We are happy.";
        char c_old[] = s.toCharArray();
        char c_new[] = new char[100];

        for(int i = 0; i < c_old.length; i++){//    change a buffer big enough
            c_new[i] = c_old[i];
        }


        System.out.println(ReplaceBlank(c_new, c_old.length));
    }

    public static String ReplaceBlank(char string[], int length){
        if(string == null||length <= 0){
            return null;
        }
        int reallength = 0;//字符串的实际总长度(不算\0)
        int numofblank = 0;//字符串中空格个数
        int i =0;
        while (string[i] != '\0'){
            reallength++;
            if(string[i] == ' ')
                numofblank++;
            ++i;
        }

        int newlength = reallength + numofblank *2;
        int s = length;
        int l = newlength;
        while (s >= 0 && l > s){
            if(string[s] != ' '){
                string[l] = string[s];
                l--;
            }
            else{
                string[l] = '0';
                string[l - 1] = '2';
                string[l - 2] = '%';
                l = l - 3;
            }
            s--;

        }
        return new String(string);
    }
}

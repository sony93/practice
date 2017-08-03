package Learn_algorithm.string;

/**
 * Created by Administrator on 2017/7/17.
 */
//模式匹配算法,其对于任何模式和目标序列，都可以在线性时间内完成匹配查找.
public class KMP {
    public static void GetNext(String P, int next[]){
        int len = P.length();
        int i = 0;
        int j = -1;//j 代表最长相同前后缀的长度
        next[0] = -1;//next[j]代表 0 到 j - 1 区段中最长相同前后缀的长度
        while (i < len){
            if(j == -1 || P.charAt(i) == P.charAt(j)){
                i++;
                j++;
                next[i] = j;
            }
            else
                j = next[j];
        }
    }
}

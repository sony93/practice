package LC;

import java.util.Stack;

/**
 * Created by Administrator on 2017/12/25.
 */
public class no657 {
    public boolean judgeCircle(String moves) {
        int rl = 0;
        int ud = 0;
        for (int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L')
                rl--;
            else if(moves.charAt(i) == 'R')
                rl++;
            else if(moves.charAt(i) == 'U')
                ud++;
            else
                ud--;
        }
        if(rl == 0 && ud == 0)
            return true;
        else
            return false;
    }
}

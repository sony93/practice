package LC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/2.
 */
public class no409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        if(map.size() == 1)
            return map.get(s.charAt(0));
        int count = 0;
        int flag = 0;
        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1)
                flag = 1;
            count += (entry.getValue() / 2) * 2;
        }
        return count + flag;
    }

    public int longestPalindrome2(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
    }
}

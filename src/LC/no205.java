package LC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sony on 18-1-3.
 */
public class no205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a).equals(b))
                    continue;
                else
                    return false;
            }
            else {
                if(!map.containsValue(b))
                    map.put(a, b);
                else
                    return false;
            }
        }
        return true;
    }
}

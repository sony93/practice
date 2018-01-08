package LC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sony on 18-1-4.
 */
public class no290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(pattern.length() != words.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++){
            char a = pattern.charAt(i);
            String b = words[i];
            if(map.containsKey(a)){
                if(map.get(a).equals(b))
                    continue;
                else
                    return false;
            }
            else {
                if(map.containsValue(b))
                    return false;
                else
                    map.put(a, b);
            }
        }
        return true;
    }
}

package LC;

import java.util.HashMap;

public class no389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if(hashMap.containsKey(s.charAt(i)))
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            else
                hashMap.put(s.charAt(i), 1);
        }

        for (int i = 0; i < t.length(); i++){
            if(hashMap.containsKey(t.charAt(i)) && hashMap.get(t.charAt(i)) != 0)
                hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
            else return t.charAt(i);
        }
        return 'a';
    }

    public static char findTheDifference2(String s, String t) {
        int charcode = t.charAt(s.length());
        for (int i = 0; i < s.length(); i++) {
            charcode -= s.charAt(i);
            charcode += t.charAt(i);
        }
        System.out.println(charcode);
        return (char) charcode;
    }

    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference2(s, t));
    }
}

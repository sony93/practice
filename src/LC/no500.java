package LC;

import java.util.*;

/**
 * Created by Administrator on 2017/6/20.
 */
public class no500 {
    public static String[] findWords(String[] words) {
        if(words == null || words.length == 0)
            return new String[]{};

        List<String> res = new ArrayList<>();

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();
        Character[] arr1 = new Character[]{'Q','q','W','w','E','e','R','r','T','t','Y','y','U','u','I','i','O','o','P','p'};
        Character[] arr2 = new Character[]{'A','a','S','s','D','d','F','f','G','g','H','h','J','j','K','k','L','l'};
        Character[] arr3 = new Character[]{'Z','z','X','x','C','c','V','v','B','b','N','n','M','m'};
        set1.addAll(Arrays.asList(arr1));
        set2.addAll(Arrays.asList(arr2));
        set3.addAll(Arrays.asList(arr3));
        for (String word: words){
            boolean row1 = false;
            boolean row2 = false;
            boolean row3 = false;
            for (int i = 0; i < word.length(); i++){
                Character s = word.charAt(i);
                if(set1.contains(s))
                    row1 = true;
                if(set2.contains(s))
                    row2 = true;
                if(set3.contains(s))
                    row3 = true;
            }
            if((row1 && !row2 && ! row3) || (!row1 && row2 && !row3) || (!row1 && !row2 && row3)){
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args){
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}

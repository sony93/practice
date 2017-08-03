package LC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/11.
 */
public class no13 {
    public static int romanToInt(String s) {
        int nums[]=new int[s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
        }

        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1])
                sum -= nums[i];
            else
                sum += nums[i];
        }
        return sum+nums[nums.length-1];
    }

    public static int romanToInt2(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++){
            char c = s.charAt(i);
            int v = map.get(c);
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
                sum -= map.get(s.charAt(i));
            else
                sum += map.get(s.charAt(i));
        }
        return sum+ map.get(s.charAt(s.length() - 1));
    }

    public static void main(String[] args){
        String a = "MMDCCCLX";
        System.out.println(romanToInt2(a));
    }
}

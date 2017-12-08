package LC;

import java.util.Stack;

/**
 * Created by sony on 17-12-6.
 */
public class no20 {
    public boolean isValid(String s) {
        if(s==null||s.length()%2!=0){
            return false;
        }
//        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if(s.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() == '[')
                    stack.pop();
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(!stack.empty() && stack.peek() == '{')
                    stack.pop();
                else{
                    return false;
                }
            }
        }
        if(!stack.empty())
            return false;

        return true;
    }
}

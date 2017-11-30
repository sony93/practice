package LINT_code;

import java.util.Stack;

/**
 * Created by sony on 17-11-30.
 */
public class lint423 {
    public static boolean isValidParentheses(String s) {
        // write your code here
        if(s==null||s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')'){
                if(!stack.empty() && stack.peek() == '(')
                    stack.pop();
                else{
                    flag = false;
                    break;
                }

            }
            else if(s.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() == '[')
                    stack.pop();
                else{
                    flag = false;
                    break;
                }
            }
            else if(s.charAt(i) == '}'){
                if(!stack.empty() && stack.peek() == '{')
                    stack.pop();
                else{
                    flag = false;
                    break;
                }
            }
        }
        if(!stack.empty())
            flag = false;

        return flag;
    }
}

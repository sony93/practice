package LINT_code;

import java.util.Stack;

/**
 * Created by sony on 17-11-23.
 */
public class lint40 {
    public lint40() {
        // do intialization if necessary
    }
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    /*
    * @param element: An integer
    * @return: nothing
    */
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    /*
         * @return: An integer
    */
    public int pop() {
        // write your code here
        if(stack2.empty()){
            while ((!stack1.empty())){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /*
         * @return: An integer
    */
    public int top() {
        // write your code here
        if(stack2.empty()){
            while ((!stack1.empty())){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public static void main(String[] args){
        lint40 lint40 = new lint40();
        lint40.push(1);
        System.out.println(lint40.pop());
        lint40.push(2);
        lint40.push(3);
        lint40.push(4);
        System.out.println(lint40.top());
        System.out.println(lint40.pop());
    }


}

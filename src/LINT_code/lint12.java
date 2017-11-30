package LINT_code;

import java.util.Stack;

/**
 * Created by sony on 17-11-30.
 */
public class lint12 {
    public lint12(){

    }
    Stack<Integer> a = new Stack<>();
    Stack<Integer> b = new Stack<>();
    public void push(int number){
        a.push(number);
        if(b.size() == 0 || b.peek() >= number){
            b.push(number);
        }
//        else
//            b.push(b.peek());

    }

    public int pop(){
        int num = a.peek();
        a.pop();
        if(b.peek() == num)
            b.pop();
        return num;
    }

    public int min(){
        return b.peek();
    }
}

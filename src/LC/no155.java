package LC;

import java.util.Stack;

/**
 * Created by sony on 18-1-19.
 */
public class no155 {
    private Stack<Integer> mStack = new Stack<Integer>();
    private Stack<Integer> mMinStack = new Stack<Integer>();

    public void push(int x) {
        mStack.push(x);
        if(!mMinStack.isEmpty()){
            int min = mMinStack.peek();
            if(x <= min)
                mMinStack.push(x);
        }
        else
            mMinStack.push(x);
    }

    public void pop(){
        int x = mStack.pop();
        if(!mMinStack.isEmpty()){
            if (x == mMinStack.peek())
                mMinStack.pop();
        }
    }

    public int top() {
        return mStack.peek();
    }

    public int getMin() {
        return mMinStack.peek();
    }
}

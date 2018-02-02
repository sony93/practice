package LC;

import java.util.Stack;

public class no503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] buf = new int[nums.length];
        for (int i = nums.length * 2 - 1; i >= 0; i--){
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]){
                stack.pop();
            }
            buf[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return buf;
    }
}

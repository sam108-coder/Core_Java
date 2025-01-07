package logical;

import java.util.Stack;

public class DeleteMiddle {

    public static void deleteMiddle(Stack<Integer> stack, int index) {
        if (index == stack.size() / 2) { // Base case: Remove middle
            stack.pop();
            return;
        }
        int temp = stack.pop(); // Pop top element
        deleteMiddle(stack, index + 1); // Recursive call
        stack.push(temp); // Push back after recursion
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        deleteMiddle(stack, 0); // Start recursion with index 0
        System.out.println(stack); // Output: [1, 2, 4, 5]
    }
}

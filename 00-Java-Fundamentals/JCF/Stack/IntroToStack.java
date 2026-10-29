/**
 * IntroToStack
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class IntroToStack {
    public static void main(String[] args) {
        // Modern stack syntax
        Deque<Integer> stack = new ArrayDeque<>();

        // push the element to the top of the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack); // top-> [40, 30, 20, 10] <-bottom

        // remove the element at top
        stack.pop();
        System.out.println(stack); // top-> [30, 20, 10] <-bottom

        // view the top element
        System.out.println(stack.peek()); // 30

        // Checks if the stack has no elements
        System.out.println(stack.isEmpty()); // false

    }
}
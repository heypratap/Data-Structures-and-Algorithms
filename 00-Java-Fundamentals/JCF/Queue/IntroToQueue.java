
/**
 * IntroToQueue
 */
import java.util.ArrayDeque;
import java.util.Queue;

public class IntroToQueue {

    public static void main(String[] args) {

        // Syntax
        Queue<Integer> queue = new ArrayDeque<>();

        // Add value
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue); // front -> [10, 20, 30] <- rear

        // remove the value from front
        System.out.println(queue.poll()); // 10
        System.out.println(queue); // [20, 30]

        // return the fornt element
        System.out.println(queue.peek()); // 20
    }
}
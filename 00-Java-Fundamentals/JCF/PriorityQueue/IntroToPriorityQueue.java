
/**
 * IntroToPriorityQueue
 */

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class IntroToPriorityQueue {
    public static void main(String[] args) {
        // Min-Heap ( Default )
        // stores value in priority order from small to larger
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(10);
        minHeap.offer(5);
        minHeap.offer(20);
        minHeap.offer(2);
        minHeap.offer(15);
        System.out.println(minHeap); // [2, 5, 20, 10, 15]

        // Max-Heap
        // stores value in priority from larger to samller
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(20);
        maxHeap.offer(2);
        maxHeap.offer(15);
        System.out.println(maxHeap); // [20, 15, 10, 2, 5]

    }

}
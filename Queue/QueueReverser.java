package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public void reverser(Queue<Integer> queue, int k) {
        if (k < 0 || k > queue.size())
            throw new IllegalArgumentException();

        Stack<Integer> stack = new Stack<>();

        // Step 1: push first k elements to stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Step 2: add them back reversed
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: move remaining elements to back
        int remainingSize = queue.size() - k;
        for (int i = 0; i < remainingSize; i++) {
            queue.add(queue.remove());
        }

        System.out.println(queue);
    }
}

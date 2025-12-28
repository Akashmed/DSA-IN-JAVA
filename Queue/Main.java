package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        var q = new QueueReverser();
//        queue.add(10);
//        queue.add(20);
//        queue.add(40);
//        q.reverse(queue);
//        System.out.println(queue);

//        var queue = new ArrayQueue(5);
//        queue.enqueue(5);
//        queue.enqueue(2);
//        queue.enqueue(7);
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue(5);
//        queue.enqueue(2);
//        queue.enqueue(7);
//        queue.enqueue(8);
//        queue.printFR();
//
//        System.out.println(queue);

        var queue = new StackQueue();
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());

    }

}

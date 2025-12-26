package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        var q = new QueueReverser();
        queue.add(10);
        queue.add(20);
        queue.add(40);
        q.reverse(queue);
        System.out.println(queue);
    }

}

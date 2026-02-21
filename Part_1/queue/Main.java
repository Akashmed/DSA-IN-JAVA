package Part_1.queue;

public class Main {
    public static void main(String[] args) {
//        Part_1.Queue<Integer> Part_1.queue = new ArrayDeque<>();
//        var q = new QueueReverser();
//        Part_1.queue.add(10);
//        Part_1.queue.add(20);
//        Part_1.queue.add(40);
//        Part_1.queue.add(50);
//        Part_1.queue.add(60);
////        q.reverse(Part_1.queue);
////        System.out.println(Part_1.queue);
//        q.reverser(Part_1.queue, 3);

//        var Part_1.queue = new ArrayQueue(5);
//        Part_1.queue.enqueue(5);
//        Part_1.queue.enqueue(2);
//        Part_1.queue.enqueue(7);
//        Part_1.queue.dequeue();
//        Part_1.queue.dequeue();
//        Part_1.queue.enqueue(5);
//        Part_1.queue.enqueue(2);
//        Part_1.queue.enqueue(7);
//        Part_1.queue.enqueue(8);
//        Part_1.queue.printFR();
//
//        System.out.println(Part_1.queue);

//        var Part_1.queue = new StackQueue();
//        Part_1.queue.enqueue(8);
//        Part_1.queue.enqueue(9);
//        Part_1.queue.enqueue(3);
//        System.out.println(Part_1.queue.dequeue());
//        System.out.println(Part_1.queue.peek());

//        var Part_1.queue = new PriorityQueue();
//        Part_1.queue.insert(2);
//        Part_1.queue.insert(8);
//        Part_1.queue.insert(5);
//        Part_1.queue.insert(3);
//        Part_1.queue.insert(1);
//        System.out.println(Part_1.queue);
//
//        while (!Part_1.queue.isEmpty()){
//            System.out.print(Part_1.queue.remove() + " ");
//        }

        var queue = new LinkedListQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.enqueue(9);
        queue.print();
        System.out.println(queue.peek());

    }

}

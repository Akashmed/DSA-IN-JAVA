package Part_1.queue;

public class LinkedListQueue {
    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node front = null;
    private Node rear = null;
    private int size;

    private boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            front = rear = node;
        }
        rear.next = node;
        rear = node;
        size++;
    }

    public void dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        front = front.next;
        size--;
    }

    public int peek() {
        return front.value;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node current = front;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.print("]");
    }
}

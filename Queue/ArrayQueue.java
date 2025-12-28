package Queue;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] array;
    private int front = 0;
    private int rear = 0;
    private int size;

    public ArrayQueue(int capacity) {
        array = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalArgumentException();

        array[rear] = item;
        rear = (rear + 1) % array.length;
        size++ ;
    }

    public void dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException();

        array[front] = 0;
        front = (front + 1) % array.length;
        size-- ;
    }

    public void printFR(){
        System.out.println("F->" + front + " R->"+ rear);
    }

    public int peek() {
        return array[rear - 1];
    }

    public boolean isFull() {
        return size == array.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
//        var contents = Arrays.copyOfRange(array, front, rear);
        return Arrays.toString(array);
    }

}

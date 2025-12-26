package Queue;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] array;
    private int front = 0;
    private int rear = 0;

    public ArrayQueue(int capacity){
        array = new int[capacity];
    }

    public void enqueue(int item){
       if(!isFull()){
           array[rear++] = item;
       }else System.out.println("queue is full");
    }

    public void dequeue(){
        if(!isEmpty()){
            front++ ;
        }else System.out.println("queue is empty");
    }

    public int peek(){
        return array[rear - 1];
    }

    public boolean isFull(){
        return (!isEmpty() && rear == array.length) ;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    @Override
    public String toString(){
        var contents = Arrays.copyOfRange(array, front, rear);
        return Arrays.toString(contents);
    }

}

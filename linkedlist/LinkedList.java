package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first = null;
    private Node last = null;
    private int size;

    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            Node current = first;
            first = current.next;
        }
        size--;

    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            previous.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != node) {
            if (current.next == node) return current;

            current = current.next;
        }
        return null;
    }

    public int indexOf(int value) {
        int index = 0;
        Node current = first;

        while (current != null) {
            if (current.value == value) return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        int index = 0;
        Node current = first;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        Node previous = first;
        Node current = first.next;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first.next = null;
        first = last;

    }
    // 2    3   4
    //      p    c

    public int getKthFromTheEnd(int k){
        if(isEmpty())
            throw new IllegalStateException();
        var secondPointer = first;
        var firstPointer = first;
        int index = 1;

        while(secondPointer != last){
            if(index > k) firstPointer = firstPointer.next;
            index++ ;
            secondPointer = secondPointer.next;
        }
        if(index < k)
            throw new IllegalArgumentException();
        return firstPointer.value;
    }


    public void print() {
        Node current = first;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.print("]");
    }
}

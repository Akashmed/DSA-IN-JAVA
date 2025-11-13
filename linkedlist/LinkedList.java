package linkedlist;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first = null;
    private Node last = null;

    private boolean isEmpty(){
        return first == null;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if(isEmpty())
            first = last = node;
        node.next = first;
        first = node;

    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty())
            first = last = node;
        last.next = node;
        last = node;

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

package linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addLast(4);
        list.addLast(5);
        list.addFirst(2);
        list.addLast(7);
        System.out.println(Arrays.toString(list.toArray()));
        list.print();
    }
}

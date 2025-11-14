package linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addLast(4);
        list.addLast(5);
        list.addFirst(2);
        list.addLast(7);
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size());
        list.print();
    }
}

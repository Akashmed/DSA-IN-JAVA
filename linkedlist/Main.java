package linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addFirst(2);
        list.addLast(7);
        System.out.println(list.indexOf(2));
        System.out.println(list.contains(9));
        list.removeFirst();
        list.removeLast();
        list.print();
    }
}

package Part_1.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addLast(4);
        list.addLast(5);
        list.addFirst(2);
        list.addLast(7);
//        list.print();
//        list.reverse();
        System.out.println(list.getKthFromTheEnd(4));
    }
}

package array;

public class Main {
    public static void main(String[] args) {
       DynamicArray numbers = new DynamicArray(3);
       numbers.insert(3);
       numbers.insert(4);
       numbers.insert(5);
       numbers.insert(6);
       numbers.insertAt(9,2);
//       numbers.remove(3);
//        System.out.println("index is: " + numbers.indexOf(5));
       numbers.print();
    }
}

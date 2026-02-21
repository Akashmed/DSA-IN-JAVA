package Part_1.stack;

public class Main {
    public static void main(String[] args) {
//        StackReverser reverser = new StackReverser();
//        var reversed = reverser.reverse("akash");
//        System.out.println(reversed);

//        BalancedExpression be = new BalancedExpression();
//        System.out.println(be.isBalanced("(akash()"));

        Stack stack = new Stack();
        stack.push('u');
        stack.push('3');
        stack.push('f');
        stack.push('5');
        stack.push('c');
        System.out.println("pop -> " + stack.pop());
        System.out.println("pop -> " + stack.pop());
        System.out.println("peek -> " + stack.peek());
        System.out.println(stack);
    }
}

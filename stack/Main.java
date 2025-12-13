package stack;

public class Main {
    public static void main(String[] args){
//        StackReverser reverser = new StackReverser();
//        var reversed = reverser.reverse("akash");
//        System.out.println(reversed);

        BalancedExpression be = new BalancedExpression();
        System.out.println(be.isBalanced("(akash()"));
    }
}

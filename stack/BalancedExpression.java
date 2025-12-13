package stack;

import java.util.Stack;

import java.util.Stack;

public class BalancedExpression {

    public void check(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '<') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == '>') {

                // If stack is empty, no matching opening
                if (stack.isEmpty()) {
                    System.out.println("Not balanced");
                    return;
                }

                char peek = stack.peek();

                switch (ch) {
                    case ')':
                        if (peek == '(') stack.pop();
                        else {
                            System.out.println("Not balanced");
                            return;
                        }
                        break;

                    case '}':
                        if (peek == '{') stack.pop();
                        else {
                            System.out.println("Not balanced");
                            return;
                        }
                        break;

                    case '>':
                        if (peek == '<') stack.pop();
                        else {
                            System.out.println("Not balanced");
                            return;
                        }
                        break;
                }
            }
        }

        // Final check
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}


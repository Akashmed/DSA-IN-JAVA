package stack;

import java.util.Stack;

import java.util.Stack;

public class BalancedExpression {

    public boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '<' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == '>' || ch == ']') {

                // If stack is empty, no matching opening
                if (stack.isEmpty()) return false;

                var top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == '>' && top != '<') ||
                        (ch == ']' && top != '[')
                ) return false;
            }
        }
        return stack.empty();
    }
}


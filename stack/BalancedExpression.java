package stack;

import java.util.Stack;

public class BalancedExpression {

    public boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }

            // Closing brackets
            else if (isRightBracket(ch)) {

                // If stack is empty, no matching opening
                if (stack.isEmpty()) return false;

                var top = stack.pop();

                if (bracketMatch(top, ch)) return false;
            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '<' || ch == '[';
    }

    private boolean isRightBracket(char ch) {
        return ch == ')' || ch == '}' || ch == '>' || ch == ']';
    }

    private boolean bracketMatch(char left, char right) {
        return (right == ')' && left != '(') ||
                (right == '}' && left != '{') ||
                (right == '>' && left != '<') ||
                (right == ']' && left != '[');
    }
}


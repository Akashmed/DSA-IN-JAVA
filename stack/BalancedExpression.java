package stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '{', '[');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', '}', ']');

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
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}



/**
 * ValidParentheses
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char lastChar = stack.pop();

                if (ch == ')' && lastChar != '(')
                    return false;
                if (ch == '}' && lastChar != '{')
                    return false;
                if (ch == ']' && lastChar != '[')
                    return false;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("(((")); // false
    }
}
//Valid Parentheses

package EasyQuestions.Strings;
import java.util.*;

public class validParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        validParentheses(str);
    }

    private static void validParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char i : str.toCharArray()) {
            if (i == '(') {
                stack.push(')');
            } else if (i == '[') {
                stack.push(']');
            } else if (i == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != i) {
                System.out.println("false");
            }
        }
        System.out.println(stack.isEmpty());
    }
}

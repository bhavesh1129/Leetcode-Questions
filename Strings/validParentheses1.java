//Valid Parentheses

package EasyQuestions.Strings;
import java.util.*;

public class validParentheses1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        validParentheses(str);
    }

    private static void validParentheses(String str) {
        Stack st = new Stack();

        if (str.charAt(0) == ')' || str.charAt(0) == ']' || str.charAt(0) == '}') {
            System.out.println("false");
        }

        for (int i = 1; i <= str.length(); i++) {
            char fc = str.charAt(i);

            if (fc == '(' || fc == '[' || fc == '{') {
                st.push(fc);
            } else if (fc == ')' || fc == ']' || fc == '}') {
                char currElem = (char) st.peek();
                if (currElem == checkMore(fc)) {
                    st.pop();
                }
            }
        }
        if (st.empty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static char checkMore(char fc) {
        if (fc == ')') {
            return '(';
        } else if (fc == ']') {
            return '[';
        } else {
            return '}';
        }
    }
}
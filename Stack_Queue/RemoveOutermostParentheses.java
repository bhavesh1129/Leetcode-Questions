package stack;

import java.util.*;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeOuterParentheses(str));
    }

    private static String removeOuterParentheses(String str) {
        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
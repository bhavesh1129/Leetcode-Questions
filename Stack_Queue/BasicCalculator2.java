package stack;

import java.util.*;

public class BasicCalculator2 {
    public static void main(String[] args) {
        String str = "-1+2";
        System.out.println(calculate(str));
    }

    private static int calculate(String str) {
        if (str == null) {
            return 0;
        }
        int result = 0;
        int sign = 1;
        int num = 0;

        Stack<Integer> st = new Stack<>();
        st.push(sign);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else if (ch == '+' || ch == '-') {
                result += sign * num;
                sign = st.peek() * (ch == '+' ? 1 : -1);
                num = 0;
            } else if (ch == '(') {
                st.push(sign);
            } else if (ch == ')') {
                st.pop();
            }
        }
        result += sign * num;
        return result;
    }
}

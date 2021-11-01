package stack;

import java.util.Arrays;
import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] arr = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(arr));
    }

    private static int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("D")) {
                int temp = st.peek();
                st.push(temp * 2);
            } else if (arr[i].equals("C")) {
                st.pop();
            } else if (arr[i].equals("+")) {
                int pop1 = st.pop();
                int pop2 = st.pop();
                int res = pop1 + pop2;
                st.push(pop2);
                st.push(pop1);
                st.push(res);
            } else {
                int temp = Integer.parseInt(arr[i]);
                st.push(temp);
            }
        }
        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }
}
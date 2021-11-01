package stack;

import java.util.Scanner;
import java.util.Stack;

public class FormMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "DD";
        maxMin(str);
    }

    private static void maxMin(String str) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= str.length(); i++) {
            st.push(i + 1);

            if (i == str.length() || str.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    System.out.print(st.pop() + " ");
                }
            }
        }
    }
}

package stack;

import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ht = {1, 2, 4, 3, 5};
//        stockSpanBrute(ht);
        stockSpanStack(ht);
    }

    private static void stockSpanStack(int[] ht) {
        Stack<Integer> st = new Stack<>();
        int[] span = new int[ht.length];
        span[0] = 1;
        st.push(0);
        for (int curr = 1; curr < ht.length; curr++) {
            while (!st.isEmpty() && ht[st.peek()] < ht[curr]) {
                st.pop();
            }
            span[curr] = st.isEmpty() ? curr + 1 : curr - st.peek();
            st.push(curr);
        }
        for (int i : span) {
            System.out.print(i + " ");
        }
    }

    private static void stockSpanBrute(int[] ht) {
        int[] span = new int[ht.length];
        Arrays.fill(span, 1);
        span[0] = 1;
        for (int i = 1; i < ht.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (ht[j] < ht[i]) {
                    span[i]++;
                } else {
                    break;
                }
            }
        }
        for (int i : span) {
            System.out.print(i + " ");
        }
    }
}

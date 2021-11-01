package stack;

import java.util.*;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ht = new int[n];
        for (int i = 0; i < ht.length; i++) {
            ht[i] = sc.nextInt();
        }
        previousGreater(ht);
    }

    private static void previousGreater(int[] ht) {
        Stack<Integer> st = new Stack<>();
        int[] pge = new int[ht.length];
        st.push(0);
        pge[0] = -1;
        for (int i = 1; i < ht.length; i++) {
            while (!st.isEmpty() && ht[st.peek()] <= ht[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                pge[i] = ht[st.peek()];
            } else {
                pge[i] = -1;
                st.push(i);
            }
        }
        System.out.println(Arrays.toString(pge));
    }
}

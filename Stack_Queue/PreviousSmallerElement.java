package stack;

import java.util.*;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int[] ht = {2, 1, 5, 6, 2, 3};
        previousSmaller(ht);
    }

    private static void previousSmaller(int[] ht) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] pse = new int[ht.length];
        pse[0] = -1;

        for (int i = 1; i < ht.length; i++) {
            while (!st.isEmpty() && ht[st.peek()] >= ht[i]) {
                st.pop();
            }
            if (!st.isEmpty())
                pse[i] = ht[st.peek()];
            else
                pse[i] = -1;
            st.push(i);
        }
        System.out.println(Arrays.toString(pse));
    }
}

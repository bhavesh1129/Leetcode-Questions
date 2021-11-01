package stack;

import java.util.Stack;

public class NumOfValidSubarrays {
    public static void main(String[] args) {
        int[] ht = {7, 1, 2, 1, 4, 5};
        numOfValidSubarrays(ht);
    }

    private static void numOfValidSubarrays(int[] ht) {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[ht.length];
        st.push(0);
        for (int i = 0; i < ht.length; i++) {
            while (!st.isEmpty() && ht[st.peek()] > ht[i]) {
                nse[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            nse[st.pop()] = ht.length;
        }
        int count = 0;
        for (int i = 0; i < ht.length; i++) {
            count += nse[i] - i;
        }
        System.out.println(count);
    }
}

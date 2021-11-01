package stack;

import java.util.*;;

public class NextSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ht = new int[n];
        for (int i = 0; i < ht.length; i++) {
            ht[i] = sc.nextInt();
        }
        nextSmaller(ht);
    }

    private static void nextSmaller(int[] ht) {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[ht.length];
        st.push(0);
        for (int i = 0; i < ht.length; i++) {
            while (!st.isEmpty() && ht[st.peek()] > ht[i]) {
                nse[st.pop()] = ht[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            nse[st.pop()] = -1;
        }
        System.out.println(Arrays.toString(nse));
    }
}

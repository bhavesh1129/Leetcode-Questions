package stack;

import java.util.Arrays;
import java.util.Stack;

public class FinalPricesWithASpecialDiscount {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 2, 3};
        arr = finalPrices(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] finalPrices(int[] arr) {
        //NSE
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[arr.length];
        st.push(0);
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                nse[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            nse[st.pop()] = arr.length;
        }
        System.out.println(Arrays.toString(nse));

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (nse[i] < arr.length) {
                res[i] = arr[i] - arr[nse[i]];
            } else {
                res[i] = arr[i];
            }
        }
        return res;
    }
}

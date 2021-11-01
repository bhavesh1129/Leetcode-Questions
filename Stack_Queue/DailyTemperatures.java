package stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {80, 80, 80, 34, 80, 80, 34, 80, 80, 80};
        arr = dailyTemperatures(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] dailyTemperatures(int[] arr) {

        //NSE
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
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
                res[i] = nse[i] - i;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }
}
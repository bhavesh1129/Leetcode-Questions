package stack;

import java.util.*;

public class MaximalRectangle {
    public static void main(String[] args) {
//        maximalRectangle(matrix);
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int cLen = matrix[0].length;
        int rLen = matrix.length;
        int[] h = new int[cLen + 1];
        h[cLen] = 0;
        int max = 0;


        for (int row = 0; row < rLen; row++) {
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < cLen + 1; i++) {
                if (i < cLen) {
                    if (matrix[row][i] == '1') {
                        h[i] += 1;
                    } else h[i] = 0;
                }
                if (st.isEmpty() || h[st.peek()] <= h[i]) {
                    {
                        st.push(i);
                    }
                } else {
                    while (!st.isEmpty() && h[i] < h[st.peek()]) {
                        int top = st.pop();
                        int area = h[top] * (st.isEmpty() ? i : (i - st.peek() - 1));
                        if (area > max) {
                            max = area;
                        }
                    }
                    st.push(i);
                }
            }
        }
        return max;
    }
}
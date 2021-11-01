package stack;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {10, 2, -5};
        Stack<Integer> res = asteroidCollision(arr);
        System.out.println(res);
    }

    private static Stack<Integer> asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        while (st.size() >= 2) {
            int pop1 = st.pop();
            int pop2 = st.pop();

            if ((pop1 > 0 && pop2 > 0) || (pop1 < 0 && pop2 < 0)) {
                st.push(pop2);
                st.push(pop1);
                return st;
            } else {
                if ((Math.abs(pop1) < Math.abs(pop2)) && (Math.abs(pop1) != Math.abs(pop2))) {
                    st.push(pop2);
                } else if ((Math.abs(pop1) > Math.abs(pop2)) && (Math.abs(pop1) != Math.abs(pop2))) {
                    st.push(pop1);
                }
            }
        }
        return st;
    }
}

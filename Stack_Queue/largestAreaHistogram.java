//Largest Area Histogram

package EasyQuestions.Stack_Queue;
import java.util.*;

public class largestAreaHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        largestAreaHistogram(arr);

    }

    private static void largestAreaHistogram(int[] arr) {
        int[] rightBoundry = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        rightBoundry[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rightBoundry[i] = arr.length;
            } else {
                rightBoundry[i] = st.peek();
            }
            st.push(i);
        }

        int[] lb = new int[arr.length];
        st = new Stack<>();

        st.push(0);
        lb[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rightBoundry[i] - lb[i] - 1;
            int area = width * arr[i];
            if (area > max) {
                max = area;
            }
        }
        System.out.println(max);
    }
}

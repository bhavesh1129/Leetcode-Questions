//Product of Array Except Self

package EasyQuestions.Arrays;

import java.util.*;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = productOfArrayExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] productOfArrayExceptSelf(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];
        }
        int r = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * r;
            r = r * arr[i];
        }
        return ans;
    }
}

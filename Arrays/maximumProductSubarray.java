//Maximum Product Subarray

package EasyQuestions.Arrays;

import java.util.Scanner;

public class maximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumProductSubarray(arr));
    }

    private static int maximumProductSubarray(int[] arr) {
        int res = 0;
        if (arr.length == 1)
            return arr[0];
        for (int i = 1; i < arr.length; i++) {
            int prod = arr[i - 1] * arr[i];
            if (prod > res) {
                res = prod;
            }
        }
        return res;
    }
}

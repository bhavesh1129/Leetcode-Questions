//Running Sum of 1d Array

package EasyQuestions.Arrays;

import java.util.*;

public class runningSumOf1dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = runningSumOf1dArray(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] runningSumOf1dArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }
}

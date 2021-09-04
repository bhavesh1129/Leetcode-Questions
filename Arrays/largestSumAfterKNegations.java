// Maximize Sum Of Array After K Negations

package EasyQuestions.Arrays;

import java.util.*;

public class largestSumAfterKNegations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = largestSumAfterKNegations(arr, k);
        System.out.println(ans);
    }

    private static int largestSumAfterKNegations(int[] arr, int k) {
        Arrays.sort(arr);
        int sum = 0, len = arr.length, minIndex = 0;
        while (k > 0) {
            arr[minIndex] *= -1;
            k--;
            if (minIndex + 1 < len && arr[minIndex] > arr[minIndex + 1])
                minIndex++;
        }
        for (int i : arr)
            sum += i;
        return sum;
    }
}
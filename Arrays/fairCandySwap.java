// Fair Candy Swap

package EasyQuestions.Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class fairCandySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] res = fairCandySwap(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] fairCandySwap(int[] arr1, int[] arr2) {
        int sumA = totalSumOfCandies(arr1);
        int sumB = totalSumOfCandies(arr2);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (sumA - arr1[i] + arr2[j] == sumB - arr2[j] + arr1[i]) {
                    int[] result = { arr1[i], arr2[j] };
                    return result;
                }
            }
        }
        return arr1;
    }

    private static int totalSumOfCandies(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

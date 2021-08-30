//Set Mismatch

package EasyQuestions.Arrays;

import java.util.*;

public class setMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = findAllNumbersDisappeared(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findAllNumbersDisappeared(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        int[] ans = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans[0] = arr[j];
                ans[1] = j + 1;
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Find the Duplicate Number

package EasyQuestions.Arrays;

import java.util.*;

public class findDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = findDuplicate(arr);
        System.out.println(res);
    }

    private static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j + 1 != arr[j]) {
                return arr[j];
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

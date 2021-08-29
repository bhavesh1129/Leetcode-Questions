//Missing Number

package EasyQuestions.Arrays;

import java.util.Scanner;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = missingNum(arr);
        System.out.println(res);
    }

    private static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && i != arr[i]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//Next Permutation

package EasyQuestions.Arrays;

import java.util.*;

public class nextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = nextPermutation(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i + 1] <= arr[i]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1);
        return arr;
    } 

    private static void reverse(int[] arr, int start) {
        int i = start, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

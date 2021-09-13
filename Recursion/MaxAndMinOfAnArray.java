package recursion;

import java.util.Scanner;

public class MaxAndMinOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfAnArray(arr, 0, arr.length));
        System.out.println(minOfAnArray(arr, 0, arr.length));
    }

    private static int maxOfAnArray(int[] arr, int start, int end) {
        if (end == 1) {
            return arr[start];
        }
        return Math.max(arr[start], maxOfAnArray(arr, start + 1, end - 1));
    }

    private static int minOfAnArray(int[] arr, int start, int end) {
        if (end == 1) {
            return arr[start];
        }
        return Math.min(arr[start], minOfAnArray(arr, start + 1, end - 1));
    }
}

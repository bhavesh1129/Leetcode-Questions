package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sumTriangle(arr);
    }

    private static void sumTriangle(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int val = arr[i] + arr[i + 1];
            temp[i] = val;
        }
        sumTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}

package bitwise;

import java.util.Scanner;

public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subsetXORSum(arr));
    }

    private static int subsetXORSum(int[] arr) {
        return helper(arr, 0, 0);
    }

    private static int helper(int[] arr, int idx, int currXOR) {
        if (idx == arr.length) {
            return currXOR;
        }
        int withElements = helper(arr, idx + 1, currXOR ^ arr[idx]);
        int withoutElements = helper(arr, idx + 1, currXOR);
        return withElements + withoutElements;
    }
}

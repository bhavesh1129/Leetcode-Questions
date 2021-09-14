package recursion;

import java.util.Scanner;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(checkWhetherArrayIsSortedOrNot(arr, 0, arr.length));
    }

    private static boolean checkWhetherArrayIsSortedOrNot(int[] arr, int start, int end) {
        if (start == end - 1) {
            return true;
        }
        if (!(arr[start] <= arr[start + 1])) {
            return false;
        }
        return checkWhetherArrayIsSortedOrNot(arr, start + 1, end);
    }
}

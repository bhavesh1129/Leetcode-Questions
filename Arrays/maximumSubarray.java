//Maximum Subarray (Kadane's Algo)

package Arrays;
import java.util.Scanner;

public class maximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        maximumSubarray(arr);
    }

    private static void maximumSubarray(int[] arr) {
        int maxSoFar = arr[0];
        int currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        System.out.println(maxSoFar);
    }
}
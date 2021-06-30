//Pivot Index

package Arrays;
import java.util.Scanner;

public class pivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pivotIndex(arr));
    }

    private static int pivotIndex(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (2 * sum == total + arr[i]) {
                return i;
            }
        }
        return -1;
    }
}

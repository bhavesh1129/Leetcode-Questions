//Seach Insert Position (Binary Search)

package Arrays;
import java.util.*;

public class searchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int targetVal = sc.nextInt();
        searchInsertPosition(arr, targetVal);
    }

    private static void searchInsertPosition(int[] arr, int targetVal) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int midVal = (low + high) / 2;
            if (arr[midVal] == targetVal) {
                System.out.println(midVal);
            } else if (arr[midVal] > targetVal) {
                high = midVal - 1;
            } else {
                low = midVal + 1;
            }
        }
        System.out.println(low);
    }
}

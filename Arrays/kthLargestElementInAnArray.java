//Kth Largest Element in an Array

package EasyQuestions.Arrays;
import java.util.*;

public class kthLargestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthLargestElementInAnArray(arr, k));
    }

    private static int kthLargestElementInAnArray(int[] arr, int k) {
        Arrays.sort(arr);
        return (arr[arr.length - k]);
    }
}

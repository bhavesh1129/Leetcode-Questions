//Make Two Arrays Equal by Reversing Sub-arrays

package Arrays;
import java.util.*;

public class makeTwoArraysEqualByReversingSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        makeTwoArraysEqualByReversingSubArrays(size, arr1, arr2);
    }

    private static void makeTwoArraysEqualByReversingSubArrays(int size, int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean ans = Arrays.equals(arr1, arr2);
        System.out.println(ans);
    }
}

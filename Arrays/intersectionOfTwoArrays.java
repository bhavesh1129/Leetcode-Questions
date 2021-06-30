//Intersection Of Two Arrays

package Arrays;
import java.util.*;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        intersectionOfTwoArrays(arr1, arr2);
    }

    private static void intersectionOfTwoArrays(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i++]);
                j++;
            }
        }
    }
}

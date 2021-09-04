// Largest Number At Least Twice of Others

package EasyQuestions.Arrays;

import java.util.*;

public class dominantIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = dominantIndex(arr);
        System.out.println(ans);
    }

    private static int dominantIndex(int[] arr) {
        int max = -1, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && (2 * arr[i]) > max)
                return -1;
        }
        return index;
    }
}

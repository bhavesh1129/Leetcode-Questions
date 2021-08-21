// Find the Duplicate Number

package EasyQuestions.Arrays;

import java.util.*;

public class findTheDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findTheDuplicateNumber(arr);
        System.out.println(ans);
    }

    private static int findTheDuplicateNumber(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        Arrays.sort(arr);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == arr[mid - 1] || arr[mid] == arr[mid + 1]) {
                return arr[mid];
            } else if ((arr[mid] != arr[mid - 1] || arr[mid] != arr[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
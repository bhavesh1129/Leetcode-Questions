//Single Element in a Sorted Array

package EasyQuestions.Arrays;

import java.util.Scanner;

public class singleElementInASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = singleElementInASortedArray(arr);
        System.out.println(ans);
    }

    private static int singleElementInASortedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 1 || arr[0] != arr[1])
            return arr[0];

        if (arr[end] != arr[end - 1])
            return arr[end];
            
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            } else if ((arr[mid] == arr[mid + 1] && mid % 2 == 0) || (arr[mid] == arr[mid - 1] && mid % 2 != 0)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

// Largest Perimeter Triangle

package EasyQuestions.Arrays;

import java.util.*;

public class largestPerimeterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = largestPerimeterTriangle(arr);
        System.out.println(ans);
    }

    private static int largestPerimeterTriangle(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 3; i >= 0; i--) {
            if (arr[i] + arr[i + 1] > arr[i + 2]) {
                return (arr[i] + arr[i + 1] + arr[i + 2]);
            }
        }
        return 0;
    }
}

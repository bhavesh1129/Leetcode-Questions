//Find the Highest Altitude

package EasyQuestions.Arrays;

import java.util.Scanner;

public class findTheHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findTheHighestAltitude(arr));
    }

    private static int findTheHighestAltitude(int[] arr) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = 0;
        int max = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            newArr[i + 1] = newArr[i] + arr[i];
            if (newArr[i + 1] > max) {
                max = newArr[i + 1];
            }
        }
        return max;
    }
}

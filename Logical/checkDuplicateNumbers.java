//Check Duplicate Numbers

package EasyQuestions.Logical;

import java.util.Scanner;

public class checkDuplicateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        checkDuplicateNumbers(arr);
    }

    private static void checkDuplicateNumbers(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j++] = arr[arr.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]);
        }
        System.out.println(arr.length - j); // number of duplicate elements
    }
}

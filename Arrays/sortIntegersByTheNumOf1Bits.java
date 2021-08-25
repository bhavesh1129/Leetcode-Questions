//Sort Integers by The Number of 1 Bits

package EasyQuestions.Arrays;

import java.util.*;

public class sortIntegersByTheNumOf1Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = sortIntegersByTheNumOf1Bits(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortIntegersByTheNumOf1Bits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (countBits(arr[j]) > countBits(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int countBits(int i) {
        int sum = 0;
        while (i != 0) {
            if (i % 2 == 1) {
                sum++;
            }
            i /= 2;
        }
        return sum;
    }
}

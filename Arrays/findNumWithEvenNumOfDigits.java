//Find Numbers with Even Number of Digits

package EasyQuestions.Arrays;

import java.util.Scanner;

public class findNumWithEvenNumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findNumWithEvenNumOfDigits(arr);
    }

    private static void findNumWithEvenNumOfDigits(int[] arr) {
        int countDig = 0, countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            countDig = (int) (Math.log10(arr[i]) + 1);
            if (countDig % 2 == 0) {
                countEven++;
            }
        }
        System.out.println(countEven);
    }
}

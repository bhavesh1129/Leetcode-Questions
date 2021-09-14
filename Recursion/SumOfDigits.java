package recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfDigitsOfANum(num));
    }

    private static int sumOfDigitsOfANum(int num) {
        if (num == 0) {
            return 0;
        }
        int temp = num % 10;
        return temp + sumOfDigitsOfANum(num /= 10);
    }
}

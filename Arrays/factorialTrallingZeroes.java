//Factorial Trailing Zeroes

package EasyQuestions.Arrays;

import java.util.Scanner;

public class factorialTrallingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorialTrallingZeroes(num));
    }

    private static int factorialTrallingZeroes(int num) {
        int count = 0;
        while (num > 0) {
            num /= 5;
            count = count + num;
        }
        return count;
    }
}

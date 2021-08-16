//Happy Number

package EasyQuestions.Logical;

import java.util.Scanner;

public class happyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = happyNumber(num);
        System.out.println(ans);
    }

    private static boolean happyNumber(int num) {
        int digit = 0;
        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                digit = num % 10;
                digit = digit * digit;
                num /= 10;
                sum += digit;
            }
            num = sum;
        }
        if (num == 1 || num == 7) {
            return true;
        }
        return false;
    }
}

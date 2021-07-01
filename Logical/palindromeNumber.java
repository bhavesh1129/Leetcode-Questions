//Palindrome Number

package EasyQuestions.Logical;
import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palindromeNumber(num);
    }

    private static void palindromeNumber(int num) {
        if (num < 0) {
            System.out.println("false");
        }
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (num != rev) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}

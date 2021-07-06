//Fibonacci Number

package EasyQuestions.Logical;
import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibonacciNumber(num));
    }

    private static int fibonacciNumber(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
    }
}
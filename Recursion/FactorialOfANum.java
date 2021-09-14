package recursion;

import java.util.Scanner;

public class FactorialOfANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if (num == 2) {
            return 2;
        }
        return num * factorial(num - 1);
    }
}

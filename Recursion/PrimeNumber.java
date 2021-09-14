package recursion;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (primeNum(num, 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static boolean primeNum(int num, int i) {
        if (num <= 2) {
            return (num == 2) ? true : false;
        }
        if (num % i == 0) {
            return false;
        }
        if (i * i > num) {
            return true;
        }
        return primeNum(num, i + 1);
    }
}

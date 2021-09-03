//Count Primes

package EasyQuestions.Logical;

import java.util.Scanner;

public class countPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = countPrimes(num);
        System.out.println(ans);
    }

    private static int countPrimes(int num) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

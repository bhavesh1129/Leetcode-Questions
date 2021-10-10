package bitwise;

import java.util.Scanner;

public class PrimeNumOfSetBitsInBinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(countPrimeSetBits(left, right));
    }

    private static int countPrimeSetBits(int left, int right) {
        int primeCount = 0;
        for (int i = left; i <= right; i++) {
            int bitsCount = countSetBits(i);
            if (isPrime(bitsCount)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    //Sieve of Eratosthenes
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Count 1's
    private static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}

package bitwise;

import java.util.Scanner;

public class BinaryNumWithAlternatingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(hasAlternatingBits(num));
    }

    public static boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n = n >> 1;
        while (n > 0) {
            if (prev == (n & 1)) {
                return false;
            }
            prev = n & 1;
            n = n >> 1;
        }
        return true;
    }
}

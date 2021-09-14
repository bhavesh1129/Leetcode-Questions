package recursion;

import java.util.Scanner;

public class PowerOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(powerOfThree(num));
    }

    private static boolean powerOfThree(int num) {
        if (num == 1) {
            return true;
        }
        if (num % 3 != 0 || num == 0) {
            return false;
        }
        return powerOfThree(num / 3);
    }
}

package recursion;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfNaturalNum(num));
    }

    private static int sumOfNaturalNum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumOfNaturalNum(num - 1);
    }
}

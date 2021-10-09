package bitwise;

import java.util.Scanner;

public class NumOfStepsToReduceANumToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(numOfSteps(num));
    }

    private static int numOfSteps(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n >> 1;
                count++;
            } else {
                n = n - 1;
                count++;
            }
        }
        return count;
    }
}

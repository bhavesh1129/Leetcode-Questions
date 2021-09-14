package recursion;

import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(numberOfStepsToZero(num));
    }

    private static int numberOfStepsToZero(int num) {
//        int count = 0;
//        while (num > 0) {
//            if (num % 2 == 0) {
//                num = num / 2;
//                count++;
//            } else {
//                num = num - 1;
//                count++;
//            }
//        }
//        return count;
        if (num == 0) {
            return 0;
        }
        if (num % 2 == 0) {
            return 1 + numberOfStepsToZero(num / 2);
        }
        return 1 + numberOfStepsToZero(num - 1);
    }
}

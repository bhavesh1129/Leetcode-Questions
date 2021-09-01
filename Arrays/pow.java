// Pow(x, n)

package EasyQuestions.Arrays;

import java.util.*;

public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(x, n));
    }

    private static double pow(double x, int n) {
        return Math.pow(x, n);
    }
}
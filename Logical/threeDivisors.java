package EasyQuestions.Logical;

import java.util.Scanner;

public class threeDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = threeDivisors(num);
        System.out.println(ans);
    }

    private static boolean threeDivisors(int num) {
        if (num < 4)
            return false;
        int root = (int) Math.sqrt(num);
        if (root * root < num)
            return false;
        for (int i = 2; i <= Math.sqrt(root); i++) {
            if (root % i == 0)
                return false;
        }
        return true;
    }
}

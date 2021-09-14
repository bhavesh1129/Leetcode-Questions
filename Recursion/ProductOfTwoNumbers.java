package recursion;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(productOfTwoNums(num1, num2));
    }

    private static int productOfTwoNums(int num1, int num2) {
        if (num1 < num2) {
            return productOfTwoNums(num2, num1);
        }
        if (num2 != 0) {
            return num1 + productOfTwoNums(num1, num2 - 1);
        }
        return 0;
    }
}

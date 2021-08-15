//Subtract the Product and Sum of Digits of an Integer

package EasyQuestions.Logical;

import java.util.*;

public class subtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = subtractTheProductAndSumOfDigitsOfAnInteger(num);
        System.out.println(ans);
    }

    private static int subtractTheProductAndSumOfDigitsOfAnInteger(int num) {
        int product = 1;
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            product *= temp;
            sum += temp;
            num /= 10;
        }
        int res = product - sum;
        return res;
    }
}

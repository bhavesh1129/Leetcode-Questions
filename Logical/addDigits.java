//Add Digits

package EasyQuestions.Logical;

import java.util.*;

public class addDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = addDigits(num);
        System.out.println(ans);
    }

    private static int addDigits(int num) {
        int sum = num;
        int x = 0;
        while (!(sum < 10)) {
            while (sum > 0) {
                x += sum % 10;
                sum /= 10;
            }
            sum = x;
            x = 0;
        }
        return sum;
    }
}

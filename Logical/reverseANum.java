//Reverse A Num

package EasyQuestions.Logical;
import java.util.*;

public class reverseANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int number = reverseANum(num);
        System.out.println(number);
    }

    private static int reverseANum(int num) {
        int ans = 0;
        while (num != 0) {
            ans = ans * 10 + num % 10;
            num /= 10;
        }
        return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? 0 : (int) ans;
    }
}
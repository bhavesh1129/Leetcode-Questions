//Power of Three

package EasyQuestions.Logical;
import java.util.Scanner;

public class powerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = powerOfThree(num);
        System.out.println(ans);
    }

    private static boolean powerOfThree(int num) {
        while (num >= 3) {
            if (num % 3 != 0)
                return false;
            num /= 3;
        }
        return num == 1;
    }
}

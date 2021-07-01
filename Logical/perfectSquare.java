//Perfect Square

package EasyQuestions.Logical;
import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = perfectSquare(num);
        System.out.println(ans);
    }

    private static boolean perfectSquare(int num) {
        int size = num / 2;
        if (num == 1)
            return true;
        for (int i = 1; i <= size; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}

//Roman To Integer

package EasyQuestions.Logical;
import java.util.Scanner;

public class romanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        romanToInteger(str);
    }

    private static void romanToInteger(String str) {
        int ans = 0;
        int num = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            switch (str.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }

            if (4 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }
        }
        System.out.println(ans);
    }
}

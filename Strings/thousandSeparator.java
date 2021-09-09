// Thousand Separator

package EasyQuestions.Strings;

import java.util.*;

public class thousandSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = thousandSeparator(num);
        System.out.println(ans);
    }

    private static String thousandSeparator(int num) {
        int count = 0;
        StringBuilder res = new StringBuilder();
        if (num == 0) {
            return "0";
        }
        while (num >= 0) {
            res.append(num % 10);
            count++;
            if (count == 3) {
                if (num / 10 > 0) {
                    res.append(".");
                    count = 0;
                }
            }
            num /= 10;
        }
        return res.reverse().toString();
    }
}

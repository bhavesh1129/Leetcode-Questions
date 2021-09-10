// Excel Sheet Column Number

package EasyQuestions.Strings;

import java.util.*;

public class excelTitleToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int ans = excelTitleToNumber(str);
        System.out.println(ans);
    }

    private static int excelTitleToNumber(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            res *= 26;
            res += ((str.charAt(i) - 'A') + 1);
        }
        return res;
    }
}

//Excel Sheet Column Title

package EasyQuestions.Strings;

import java.util.Scanner;

public class excelSheetColumnTitle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(excelSheetColumnTitle(num));
    }

    private static String excelSheetColumnTitle(int num) {
        String result = "";
        while (num > 0) {
            num--;
            result = (char) ('A' + (num % 26)) + result;
            num = num / 26;
        }
        return result;
    }
}

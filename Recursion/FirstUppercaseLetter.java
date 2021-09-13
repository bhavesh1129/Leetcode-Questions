package recursion;

import java.util.Scanner;

public class FirstUppercaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(firstUppercaseLetterInAString(str, 0, str.length() - 1));
    }

    private static char firstUppercaseLetterInAString(String str, int start, int end) {
            if (Character.isUpperCase(str.charAt(start))) {
                return str.charAt(start);
            }
        return firstUppercaseLetterInAString(str, start + 1, end);
    }
}

//Valid Palindrome

package EasyQuestions.Strings;

import java.util.*;

public class validPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(validPalindrome(str));
    }

    private static boolean validPalindrome(String str) {
        String newStr = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                newStr += ch;
            }
        }
        String rev = new StringBuffer(newStr).reverse().toString();
        return (newStr.equals(rev));

        // int start = 0;
        // int end = s.length() - 1;
        // while (start <= end) {
        // while (start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
        // start++;
        // }
        // while (start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
        // end--;
        // }
        // if (start <= end && Character.toLowerCase(s.charAt(start)) !=
        // Character.toLowerCase(s.charAt(end))) {
        // return false;
        // }
        // start++;
        // end--;
        // }
        // return true;
    }
}
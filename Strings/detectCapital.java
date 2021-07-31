//Detect Capital

package EasyQuestions.Strings;

import java.util.Scanner;

public class detectCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(detectCapital(str));
    }

    private static boolean detectCapital(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - 'A' < 26) {
                count++;
            }
        }
        if (count == str.length())
            return true;
        else if (count == 1 && str.charAt(0) - 'A' < 26)
            return true;
        else if (count == 0)
            return true;
        else
            return false;
    }
}

//Check Pangram

package EasyQuestions.Strings;

import java.util.Scanner;

public class checkPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ans = checkIfPangram(str);
        System.out.println(ans);
    }

    private static boolean checkIfPangram(String str) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabets.length(); i++) {
            if (str.indexOf(alphabets.charAt(i)) == -1)
                return false;
        }
        return true;
    }
}

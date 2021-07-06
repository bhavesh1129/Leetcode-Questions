//Length of Last Word

package EasyQuestions.Strings;
import java.util.Scanner;

public class lengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        lengthOfLastWord(str);
    }

    private static void lengthOfLastWord(String str) {
        int strLength = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                if (strLength != 0) {
                    System.out.println(strLength);
                }
            } else {
                strLength++;
            }
        }
        System.out.println(strLength);
    }
}

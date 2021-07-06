//Find The Difference

package EasyQuestions.Strings;
import java.util.*;

public class findTheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        findTheDifference(str1, str2);
    }

    private static void findTheDifference(String str1, String str2) {
        int charArr1 = 0;
        int charArr2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            charArr1 += str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            charArr2 += str2.charAt(i);
        }

        System.out.println((char) (charArr2 - charArr1));
    }
}

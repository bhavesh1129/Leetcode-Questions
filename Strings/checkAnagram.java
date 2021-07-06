//Check Anagram

package EasyQuestions.Strings;
import java.util.*;

public class checkAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        checkAnagram(str1, str2);
    }

    private static void checkAnagram(String str1, String str2) {
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        boolean ans = Arrays.equals(charArr1, charArr2);
        System.out.println(ans);
    }
}

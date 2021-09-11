// Remove Duplicate Letters

package EasyQuestions.Strings;

import java.util.*;

public class removeDuplicateLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = removeDuplicateLetters(str);
        System.out.println(ans);
    }

    private static String removeDuplicateLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    
                }
            }
        }
        return null;
    }
}

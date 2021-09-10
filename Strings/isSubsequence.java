//Is Subsequence

package EasyQuestions.Strings;

import java.util.*;

public class isSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
        boolean ans = isSubsequence(str, target);
        System.out.println(ans);
    }

    private static boolean isSubsequence(String str, String target) {
        int i = 0;
        int j = 0;
        while (i < str.length() && j < target.length()) {
            if (str.charAt(i) == target.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == str.length();
    }
}

// First Unique Character in a String

package EasyQuestions.Strings;

import java.util.*;

public class firstUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = firstUniqueChar(str);
        System.out.println(ans);
    }

    private static int firstUniqueChar(String s) {
        int[] count = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int idx = s.charAt(i) - 'a';
            count[idx]++;
        }

        for (int i = 0; i < len; i++) {
            int idx = s.charAt(i) - 'a';
            if (count[idx] == 1) {
                return i;
            }
        }
        return -1;
    }
}

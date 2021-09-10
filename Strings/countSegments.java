// Number of Segments in a String

package EasyQuestions.Strings;

import java.util.*;

public class countSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = countSegments(str);
        System.out.println(ans);
    }

    private static int countSegments(String str) {
        if (str == null || str.trim().equals("")) {
            return 0;
        }
        return str.trim().split("\\s+").length;
    }
}
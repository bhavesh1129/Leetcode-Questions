// Reverse Words in a String

package EasyQuestions.Strings;

import java.util.*;

public class reverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseWords(str);
        System.out.println(ans);
    }

    private static String reverseWords(String str) {
        String strArr[] = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        System.out.println(Arrays.toString(strArr));

        for (int i = strArr.length - 1; i >= 1; i--) {
            sb.append(strArr[i] + " ");
        }
        sb.append(strArr[0]);
        return sb.toString();
    }
}
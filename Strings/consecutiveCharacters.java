//Consecutive Characters

package EasyQuestions.Strings;
import java.util.Scanner;

public class consecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        consecutiveCharacters(str);
    }

    private static void consecutiveCharacters(String str) {
        int count = 1;
        int max = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
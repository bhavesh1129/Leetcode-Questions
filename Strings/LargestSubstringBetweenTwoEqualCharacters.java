//Largest Substring Between Two Equal Characters

package EasyQuestions.Strings;
import java.util.Scanner;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        largestSubstringBetweenTwoEqualCharacters(str);
    }

    private static void largestSubstringBetweenTwoEqualCharacters(String str) {
        int max = -1;
        for (int i = 0; i < str.length(); i++) {
            int lastIndex = str.lastIndexOf(str.charAt(i));
            if (lastIndex != i) {
                max = Math.max(max, lastIndex - (i + 1));
            }
        }
        System.out.println(max);
    }
}
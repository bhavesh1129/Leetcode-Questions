//Reverse String II

package EasyQuestions.Strings;
import java.util.Scanner;

public class reverseStringII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(reverseStringII(str, k));
    }

    private static String reverseStringII(String str, int k) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i += 2 * k) {
            reverse(ch, i, i + k);
        }
        return String.valueOf(ch);
    }

    private static void reverse(char[] ch, int i, int j) {
        j = Math.min(ch.length, j) - 1;
        for (; i < j; i++, j--) {
            char tmp = ch[i];
            ch[i] = ch[j];
            ch[j] = tmp;
        }
    }
}
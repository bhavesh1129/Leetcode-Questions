//To lower Case

package EasyQuestions.Strings;
import java.util.*;

public class toLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        toLowerCase(str);
    }

    private static void toLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            char firstChar = str.charAt(i);
            if (firstChar >= 65 && firstChar <= 90) {
                firstChar +=32;
            }
            System.out.print(firstChar);
        }
    }
}
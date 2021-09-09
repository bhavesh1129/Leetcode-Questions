//Goal Parser Interpretation

package EasyQuestions.Strings;

import java.util.Scanner;

public class goalParserInterpretation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = goalParserInterpretation(str);
        System.out.println(ans);
    }

    private static String goalParserInterpretation(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'G') {
                sb.append("G");
            } else if (str.charAt(i) == '(') {
                if (str.charAt(i + 1) == ')') {
                    sb.append("o");
                    i++;
                } else {
                    sb.append("al");
                    i += 3;
                }
            }
        }
        return sb.toString();
    }
}

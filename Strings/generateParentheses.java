//Generate Parentheses

package EasyQuestions.Strings;
import java.util.*;

public class generateParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> res = generateParenthesis(num);
        System.out.println(res);
    }

    private static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        generatePara(res, "", 0, 0, n);
        return res;
    }

    private static void generatePara(ArrayList<String> res, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            res.add(str);
            return;
        }
        if (open < max) {
            generatePara(res, str + "(", open + 1, close, max);
        } else if (close < open) {
            generatePara(res, str + ")", open, close + 1, max);
        }
    }
}

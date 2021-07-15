//Remove Outermost Parentheses

package EasyQuestions.Stack_Queue;
import java.util.*;

public class removeOuterParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        removeOuterParentheses(str);
    }

    private static void removeOuterParentheses(String str) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;
        for (char elem : str.toCharArray()) {
            if (elem == '(') {
                if (opened > 0)
                    sb.append(elem);
                opened++;
            } else {
                if (opened > 1)
                    sb.append(elem);
                opened--;
            }
        }
        System.out.println(sb.toString());
    }
}
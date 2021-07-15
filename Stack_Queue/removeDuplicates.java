//Remove Duplicates

package EasyQuestions.Stack_Queue;
import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        removeDuplicates(str);
    }

    private static void removeDuplicates(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.size() == 0 || st.peek() != str.charAt(i)) {
                st.push(str.charAt(i));
            } else {
                st.pop();
            }
        }
        String res = "";
        while (!st.isEmpty()) {
            res = st.peek() + res;
            st.pop();
        }
        System.out.println(res);
    }
}
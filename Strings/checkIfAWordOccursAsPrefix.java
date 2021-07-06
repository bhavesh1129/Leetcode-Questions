//Check If a Word Occurs As a Prefix of Any Word in a Sentence

package EasyQuestions.Strings;
import java.util.Scanner;

public class checkIfAWordOccursAsPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String searchWord = sc.next();
        int ans = checkIfAWordOccursAsPrefix(str, searchWord);
        System.out.println(ans);
    }

    private static int checkIfAWordOccursAsPrefix(String str, String searchWord) {
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() >= searchWord.length()) {
                if (strArr[i].substring(0, searchWord.length()).equals(searchWord)) {
                    return (i + 1);
                }
            }
        }
        return -1;
    }
}

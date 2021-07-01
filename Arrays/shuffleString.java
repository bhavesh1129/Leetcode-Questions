//Shuffle String

package EasyQuestions.Arrays;
import java.util.*;

public class shuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = sc.nextInt();
        }
        shuffleString(str,arr);
    }

    private static void shuffleString(String str, int[] arr) {
        char[] temp = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]] = str.charAt(i);
        }
            System.out.println(new String(temp));
    }
}

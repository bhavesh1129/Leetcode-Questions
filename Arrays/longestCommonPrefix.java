//Longest Common Prefix

package Arrays;
import java.util.*;

public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArr = new String[num];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.next();
        }
        longestCommonPrefix(strArr);
    }

    private static void longestCommonPrefix(String[] strArr) {
        if (strArr.length == 0 || strArr == null) {
            System.out.println("");
        }
        Arrays.sort(strArr);
        String firstChar = strArr[0];
        String lastChar = strArr[strArr.length - 1];
        int i = 0;
        while (i < firstChar.length()) {
            if (firstChar.charAt(i) == lastChar.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        System.out.println(i == 0 ? "" : firstChar.substring(0, i));
    }
}

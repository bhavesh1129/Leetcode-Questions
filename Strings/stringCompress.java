// String Compression

package EasyQuestions.Strings;

import java.util.*;

public class stringCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.nextLine();
        char[] chArr = str.toCharArray();
        int ans = stringCompress(chArr);
        System.out.println(ans);
    }

    private static int stringCompress(char[] chArr) {
        int index = 0, count = 0;
        for (int i = 0; i < chArr.length; i++) {
            count++;
            if (i + 1 == chArr.length || chArr[i] != chArr[i + 1]) {
                chArr[index++] = chArr[i];
                if (count != 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chArr[index++] = c;
                    }
                }
                count = 0;
            }
        }
        return index;
    }
}

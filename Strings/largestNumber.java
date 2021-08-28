//Largest Number

package EasyQuestions.Strings;

import java.util.*;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String ans = largestNumber(arr);
        System.out.println(ans);
    }

    private static String largestNumber(int[] arr) {
        if (arr.length == 0)
            return "";
        String[] conv = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            conv[i] = Integer.toString(arr[i]);
        }
        Arrays.sort(conv, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder res = new StringBuilder();
        if (conv[0].equals("0"))
            return "0";
        for (int i = 0; i < conv.length; i++) {
            res.append(conv[i]);
        }
        return res.toString();
    }
}

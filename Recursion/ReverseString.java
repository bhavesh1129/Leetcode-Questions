package recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        reverseStr(ch, 0, ch.length - 1);
    }

    private static void reverseStr(char[] ch, int start, int end) {
        if (start > end) {
            return;
        }
        reverseStr(ch, start + 1, end);
        System.out.print(ch[start] + " ");
    }
}

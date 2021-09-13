package recursion;

import java.util.Scanner;

public class LengthOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lengthOfAString(str));
    }

    private static int lengthOfAString(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + lengthOfAString(str.substring(1));
    }
}

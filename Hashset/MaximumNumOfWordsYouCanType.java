package hashset;

import java.util.Scanner;

public class MaximumNumOfWordsYouCanType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.next();
        System.out.println(canBeTypedWords(s1, s2));
    }

    private static int canBeTypedWords(String s1, String s2) {
        String str[] = s1.split(" ");
        int count = 0;
        for (String word : str) {
            for (int i = 0; i < s2.length(); i++) {
                if (word.indexOf(s2.charAt(i)) != -1) {
                    count++;
                    break;
                }
            }
        }
        return str.length - count;
    }
}

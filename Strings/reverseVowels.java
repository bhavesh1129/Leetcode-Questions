//Reverse Vowels of a String

package EasyQuestions.Strings;

import java.util.Scanner;

public class reverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = reverseVowels(str);
        System.out.println(ans);
    }

    private static String reverseVowels(String str) {
        int i = 0, j = str.length() - 1;
        char[] arr = str.toCharArray();
        String vowels = "aeiouAEIOU";
        while (i < j) {
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

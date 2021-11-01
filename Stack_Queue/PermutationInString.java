package stack;

import java.util.*;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        System.out.println(permutation(s1, s2));
    }

    private static boolean permutation(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(arr1, arr2)) return true;

        int front = 0;
        int back = s1.length();
        while (back < s2.length()) {
            arr2[s2.charAt(front) - 'a']--;
            arr2[s2.charAt(back) - 'a']++;

            if (Arrays.equals(arr1, arr2)) return true;
            front++;
            back++;
        }
        return false;
    }
}

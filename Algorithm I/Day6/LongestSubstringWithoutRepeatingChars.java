package heap;

import java.util.*;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(longestSubstring(str));
    }

    private static int longestSubstring(String str) {
        int maxLen = 0;
        Set<Character> window = new HashSet<>();

        int left = 0, right = 0;
        while (right < str.length()) {
            while (window.contains(str.charAt(right))) {
                window.remove(str.charAt(left++));
            }
            window.add(str.charAt(right++));
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}

package hashset;

import java.util.HashMap;
import java.util.Scanner;

public class CharactersHaveEqualNumOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(areOccurrencesEqual(str));
    }

    private static boolean areOccurrencesEqual(String s) {
        if (s.length() == 1)
            return true;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int freq = map.get(s.charAt(0));
        for (char key : map.keySet()) {
            if (map.get(key) != freq)
                return false;
        }
        return true;
    }
}

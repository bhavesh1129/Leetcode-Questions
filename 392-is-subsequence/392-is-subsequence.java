class Solution {
    public boolean isSubsequence(String str, String target) {
        int i = 0, j = 0;
        while (i < str.length() && j < target.length()) {
            if (str.charAt(i) == target.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == str.length();
    }
}
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] cache = new int[text1.length() + 1][text2.length() + 1];
        for (int[] e : cache) {
            Arrays.fill(e, -1);
        }
        return lcs(text1, text2, 0, 0, cache);
    }
    public int lcs(String text1, String text2, int curr1, int curr2, int[][] cache) {
        if(curr1 == text1.length() || curr2 == text2.length()){
            return 0;
        }
        if(cache[curr1][curr2] != -1){
            return cache[curr1][curr2];
        }
        if(text1.charAt(curr1) == text2.charAt(curr2)){
            return lcs(text1, text2, curr1 + 1, curr2 + 1, cache) + 1;
        }else{
            int c1 = lcs(text1, text2, curr1 + 1, curr2, cache);
            int c2 = lcs(text1, text2, curr1, curr2 + 1, cache);
            return cache[curr1][curr2] = Math.max(c1, c2);
        }
    }
}

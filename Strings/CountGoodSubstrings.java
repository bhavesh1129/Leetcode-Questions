class Solution {
    public int countGoodSubstrings(String str) {
        int res= 0;
        char[] s = str.toCharArray();
        for(int i = 1; i < s.length - 1; i++){
            if((s[i-1] != s[i]) && (s[i] != s[i+1]) && (s[i-1] != s[i+1])){
                res++;
            }
        }
        return res;
    }
}

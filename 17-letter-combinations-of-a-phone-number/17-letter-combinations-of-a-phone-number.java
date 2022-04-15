class Solution {
    public static Map<Character, String> map = new HashMap<>();
    
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if (digits.length() == 0 || digits == null) {
            return ans;
        }
        StringBuilder sb = new StringBuilder();
        backtrack(sb, digits, ans, 0);
        return ans;
    }
    
    public static void backtrack(StringBuilder sb, String str, List<String> list, int start) {
        if (sb.length() == str.length()) {
            list.add(sb.toString());
            return;
        }
        for (int i = start; i < str.length(); i++) {
            String strList = map.get(str.charAt(i));
            for (int j = 0; j < strList.length(); j++) {
                sb.append(strList.charAt(j));
                backtrack(sb, str, list, i + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
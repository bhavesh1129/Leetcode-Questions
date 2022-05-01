class Solution {
    public boolean backspaceCompare(String s, String t) {
        String resStr1 = solve(s);
        String resStr2 = solve(t);
        return resStr1.equals(resStr2);
    }
    public String solve(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || str.charAt(i) != '#') {
                st.push(str.charAt(i));
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
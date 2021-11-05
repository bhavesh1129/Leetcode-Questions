class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char i : str.toCharArray()) {
            if (i == '(') {
                stack.push(')');
            } else if (i == '[') {
                stack.push(']');
            } else if (i == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != i) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

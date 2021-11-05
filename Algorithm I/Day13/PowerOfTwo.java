class Solution {
    public boolean isPowerOfTwo(int num) {
        if (num == 1) {
            return true;
        }
        if (num % 2 != 0 || num == 0) {
            return false;
        }
        return isPowerOfTwo(num / 2);
    }
}

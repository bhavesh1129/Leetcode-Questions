class Solution {
    public int findComplement(int n) {
        int numberOfDigits = (int) (Math.log(n) / Math.log(2)) + 1;
        return n ^ ((1 << numberOfDigits) - 1);
    }
}

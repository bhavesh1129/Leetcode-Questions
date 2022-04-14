class Solution {
    public int arrangeCoins(int num) {
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == num) {
                return (int) mid;
            } else if (sum > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) end;
    }
}
class Solution {
    public int countOrders(int n) {
        int MOD = 1_000_000_007;
        if (n == 0) {
            return 1;
        }
        long ans = n * (2 * n - 1) % MOD;
        ans = (ans * countOrders(n - 1)) % MOD;
        return (int) ans;
    }
}
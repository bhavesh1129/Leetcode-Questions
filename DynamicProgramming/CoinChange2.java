class Solution {
    public int change(int amount, int[] coins) {
        int[][] cache = new int[amount + 1][coins.length + 1];
        for(int[] i : cache){
            Arrays.fill(i, -1);
        }
        return change(amount, coins.length, coins, cache);
    }
    public int change(int amount, int n, int[] coins, int[][] cache) {
        if(amount == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(cache[amount][n] != -1){
            return cache[amount][n];
        }
        int pick = 0, dontPick = 0;
        if(coins[n - 1] <= amount){
            pick = change(amount - coins[n - 1], n, coins, cache);
        }
        dontPick = change(amount, n - 1, coins, cache);
        return cache[amount][n] = pick + dontPick;
    }
}

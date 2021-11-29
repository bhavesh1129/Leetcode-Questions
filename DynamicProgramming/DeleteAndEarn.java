class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        for(int i : nums){
            maxVal = Math.max(maxVal, i);
        }
        int[] houses = new int[maxVal + 1];
        for(int i : nums){
            houses[i] += i;
        }
        int n = houses.length;
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        return sol(houses, n, cache);
    }
    private int sol(int[] houses, int n, int[] cache) {
        if (n <= 0) {
            return 0;
        }
        if (cache[n] != -1) {
            return cache[n];
        }
        int ifRobbed = sol(houses, n - 2, cache) + houses[n - 1];
        int ifNotRobbed = sol(houses, n - 1, cache);
        return cache[n] = Math.max(ifNotRobbed, ifRobbed);
    }
}

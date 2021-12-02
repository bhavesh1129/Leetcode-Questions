class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        
        int cost1 = sol(cost, 0, cache);
        int cost2 = sol(cost, 1, cache);
        return Math.min(cost1, cost2);
    }
    public int sol(int[] cost, int currIdx, int[] cache) {
        if(currIdx >= cost.length){
            return 0;
        }
        if(currIdx == cost.length - 1){
            return cost[currIdx];
        }
        if(cache[currIdx] != -1){
            return cache[currIdx];
        }
        int c1 = sol(cost, currIdx + 1, cache);
        int c2 = sol(cost, currIdx + 2, cache);
        return cache[currIdx] = (Math.min(c1, c2) + cost[currIdx]);
    }
}

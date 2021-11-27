class Solution {
    public int rob(int[] nums) {
        int curr = 0;
        int n = nums.length;
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        return rob(nums, curr, n, cache);
    }
    public int rob(int[] nums, int curr, int n, int[] cache){
        if (curr >= n) {
            return 0;
        }
        if (cache[curr] != -1) {
            return cache[curr];
        }
        int ifRobbed = rob(nums, curr + 2, n, cache) + nums[curr];
        int ifNotRobbed = rob(nums, curr + 1, n, cache);
        return cache[curr] = Math.max(ifNotRobbed, ifRobbed);
    }
}

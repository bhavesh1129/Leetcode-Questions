class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] cache = new int[nums.length + 1][nums.length + 1];
        for (int[] e : cache) {
            Arrays.fill(e, -1);
        }
        return lis(nums, 0, nums.length, -1, cache);
    }
    public int lis(int[] nums, int curr, int n, int prev, int[][] cache){
        if(curr == n){
            return 0;
        }
        if(cache[curr][prev + 1] != -1){
            return cache[curr][prev + 1];
        }
        int inc = 0;
        if(prev == -1 || nums[curr] > nums[prev]){
            inc = lis(nums, curr + 1, n, curr, cache) + 1;
        }
        int exc = lis(nums, curr + 1, n, prev, cache);
        return cache[curr][prev + 1] = Math.max(inc, exc);
    }
}

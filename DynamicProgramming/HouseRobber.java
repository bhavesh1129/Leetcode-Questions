class Solution {
    public int rob(int[] nums) {
        int curr = 0;
        return rob(nums, curr, nums.length);
    }
    public int rob(int[] nums, int curr, int n){
        if(curr >= n){
            return 0;
        }
        int ifRobbed = rob(nums, curr + 2, n) + nums[curr];
        int ifNotRobbed = rob(nums, curr + 1, n);
        return Math.max(ifRobbed, ifNotRobbed);
    }
}

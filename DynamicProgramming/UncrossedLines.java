class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return sol(nums1, nums2, 0, 0, dp);
    }
    public int sol(int[] nums1, int[] nums2, int c1, int c2, int[][] dp) {
        if (c1 == nums1.length || c2 == nums2.length) {
            return 0;
        }
        if (dp[c1][c2] != -1) {
            return dp[c1][c2];
        }
        if (nums1[c1] == nums2[c2]) {
            return dp[c1][c2] = sol(nums1, nums2, c1 + 1, c2 + 1, dp) + 1;
        } else {
            int s = sol(nums1, nums2, c1 + 1, c2, dp);
            int t = sol(nums1, nums2, c1, c2 + 1, dp);
            return dp[c1][c2] = Math.max(s, t);
        }
    }
}

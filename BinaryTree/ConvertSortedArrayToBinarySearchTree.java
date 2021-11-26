/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = sortedArrayToBST(nums, 0, nums.length - 1);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if(left > right){
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode nn = new TreeNode(nums[mid]);
        nn.left = sortedArrayToBST(nums, left, mid - 1);
        nn.right = sortedArrayToBST(nums, mid + 1, right);
        return nn;
    }
}

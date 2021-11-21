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
    public int minDepth(TreeNode root) {
        int ans = minDepthH(root);
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
    public int minDepthH(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftDepth = minDepthH(root.left);
        int rightDepth = minDepthH(root.right);
        
        int ans = Math.min(leftDepth, rightDepth) + 1;
        return ans;
    }
}

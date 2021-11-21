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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumH(root, targetSum, 0);
    }
    public boolean hasPathSumH(TreeNode root, int targetSum, int cSum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            if(cSum + root.val == targetSum){
                return true;
            }
        }
        boolean leftSum = hasPathSumH(root.left, targetSum, cSum + root.val);
        boolean rightSum = hasPathSumH(root.right, targetSum, cSum + root.val);
        return leftSum || rightSum;//get answer from either left or right tree
    }
}

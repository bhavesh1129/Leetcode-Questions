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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root, long minR, long maxR){
        if(root == null){
            return true;
        }
        if(root.val <= minR || root.val >= maxR){
            return false;
        }
        boolean isLeftValid = isValidBST(root.left, minR, root.val);
        boolean isRightValid = isValidBST(root.right, root.val, maxR);
        return isLeftValid && isRightValid;
    }
}

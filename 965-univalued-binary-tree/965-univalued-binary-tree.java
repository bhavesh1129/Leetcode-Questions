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
    public boolean isUnivalTree(TreeNode root) {
        return checkTree(root, root.val);
    }
    
    public boolean checkTree(TreeNode root, int val) {
        if(root == null){
            return true;
        }
        if(root.val != val){
            return false;
        }
        return checkTree(root.left, val) && checkTree(root.right, val);
    }
}
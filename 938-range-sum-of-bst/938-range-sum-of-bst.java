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
    int res = 0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        sol(root, low, high);
        return res;
    }
    
    public void sol(TreeNode root, int low, int high) {
        if(root == null){
            return;
        }
        if(root.val >= low && root.val <= high){
            res += root.val;
        }
        sol(root.left, low, high);
        sol(root.right, low, high);
    }
}
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        
        boolean ans1 = flipEquiv(root1.left,root2.right);
        boolean ans2 = flipEquiv(root1.right,root2.left);
        boolean ans3 = flipEquiv(root1.left,root2.left);
        boolean ans4 = flipEquiv(root1.right,root2.right);
        
        return (ans1 && ans2) || (ans3 && ans4);
    }
}

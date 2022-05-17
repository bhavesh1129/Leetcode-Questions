/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans, target;
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inOrder(original, cloned);
        return ans;
    }
    
    public void inOrder(TreeNode b1, TreeNode b2) {
        if (b1 != null) {
            inOrder(b1.left, b2.left);
            if (b1 == target) {
                ans = b2;    
            }
            inOrder(b1.right, b2.right);    
        }
    }
}
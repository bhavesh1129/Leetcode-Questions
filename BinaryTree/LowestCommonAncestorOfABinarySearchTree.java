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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = lcaHelper(root, p, q);
        return ans == null ? null : ans;
    }
    public TreeNode lcaHelper(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode leftAns = lcaHelper(root.left, p, q);
        TreeNode rightAns = lcaHelper(root.right, p, q);
        if(leftAns != null && rightAns != null){
            return root;
        }
        if(leftAns == null){
            return rightAns;
        }
        return leftAns;
    }
}

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
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);
        int ans = Math.max(leftH, rightH) + 1;
        return ans;
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
			return true;
		}
		int leftH = height(root.left);
		int rightH = height(root.right);

		boolean isRootBalanced = (Math.abs(leftH - rightH) <= 1);

		// isBalanced(root.right);
		return isRootBalanced && isBalanced(root.right) && isBalanced(root.left);
    }
}

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
        if (root == null) {
			return 0;
		}
		int leftH = height(root.left);
		int rightH = height(root.right);

		int totalH = Math.max(leftH + 1, rightH + 1);
		return totalH;
    }
    public int maxDepth(TreeNode root) {
        return height(root);
    }
}

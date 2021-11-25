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
    public int min(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return min(root.left);
    }
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if (val < root.val) {
            root.left = deleteNode(root.left, val);
        } else if (val > root.val) {
            root.right = deleteNode(root.right, val);
        } else {
            if (root.right == null && root.left == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            } else {
                int inorderSucc = min(root.right);
                root.val = inorderSucc;
                root.right = deleteNode(root.right, inorderSucc);
            }
        }
        return root;
    }
}

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode nn = new TreeNode(val);
            root = nn;
        }
        insert(root, val);
        return root;
    }
    public void insert(TreeNode root, int val) {
        if (val > root.val) {
            //insert in right tree
            if (root.right != null) {
                insert(root.right, val);
            } else {
                TreeNode nn = new TreeNode(val);
                root.right = nn;
            }
        } else if (val < root.val) {
            //insert in left tree
            if (root.left != null) {
                insert(root.left, val);
            } else {
                TreeNode nn = new TreeNode(val);
                root.left = nn;
            }
        }
    }
}

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        addPath(root, list, "");
        return list;
    }
    
    public void addPath(TreeNode root, List<String> list, String currPath) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            currPath += root.val;
            list.add(currPath);
            return;
        }
        currPath += root.val + "->";
        addPath(root.left, list, currPath);
        addPath(root.right, list, currPath);
    }
}
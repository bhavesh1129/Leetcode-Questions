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
    List<Integer> list = new ArrayList<>();
    
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        TreeNode head = new TreeNode(-1);
        TreeNode temp = head;
        for(int i = 0; i < list.size(); i++){
            head.right = new TreeNode(list.get(i));
            head = head.right;
        }
        return temp.right;
    }
    
    public void inOrder(TreeNode root){
        if (root != null) {
            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
    }
}
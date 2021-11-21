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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        rightSideViewH(root, list, 0);
        return list;
    }
    public void rightSideViewH(TreeNode root, ArrayList<Integer>list, int level) {
        if(root == null){
            return;
        }
        if(level == list.size()){
            list.add(root.val);
        }
        rightSideViewH(root.right, list, level + 1);
        rightSideViewH(root.left, list, level + 1);
    }
}

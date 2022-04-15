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
    int[] level = {-1,-1};
    int[] parent = {-1,-1};
    public boolean isCousins(TreeNode root, int x, int y) {
        sol(root, x, y, 0, new TreeNode(-1));
        return (level[0] == level[1] && parent[0] != parent[1]);
    }
    
    public void sol(TreeNode root, int x, int y, int currLvl, TreeNode currNode) {
        if(root == null){
            return;
        }
        if(root.val == x){
            level[0] = currLvl;
            parent[0] = currNode.val;
        }
        if(root.val == y){
            level[1] = currLvl;
            parent[1] = currNode.val;
        }
        sol(root.left, x, y, currLvl + 1, root);
        sol(root.right, x, y, currLvl + 1, root);
    }
}
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
    public int findBottomLeftValue(TreeNode root) {
        if(root == null){
            return 0;
        }
        int[] result = {root.val, 0};
        sol(root, 0, result);
        return result[0];
    }
    
    public void sol(TreeNode root, int currLvl, int[] res) {
        if(root == null){
            return;
        }
        if(currLvl > res[1]){
            res[0] = root.val;
            res[1] = currLvl;
        }
        sol(root.left, currLvl + 1, res);
        sol(root.right, currLvl + 1, res);
    }
}
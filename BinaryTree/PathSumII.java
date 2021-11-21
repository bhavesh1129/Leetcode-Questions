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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        pathSumH(root, targetSum, list, ans, 0);
        return ans;
    }
    public void pathSumH(TreeNode root, int targetSum, List<Integer> list, List<List<Integer>> ans, int cSum){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(cSum + root.val == targetSum){
                list.add(root.val);
                ans.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
                return;
            }
        }
        list.add(root.val);
        pathSumH(root.left, targetSum, list, ans, cSum + root.val);
        pathSumH(root.right, targetSum, list, ans, cSum + root.val);
        list.remove(list.size() - 1);
    }
}

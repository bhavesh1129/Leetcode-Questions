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
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        return rangeSum(root, low, high);
    }
    public int rangeSum(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        if(root.val < low){
            rangeSum(root.right, low, high);
        }else if(root.val > high){
            rangeSum(root.left, low, high);
        }else{
            // System.out.print(root.val+" ");
            rangeSum(root.left, low, high);
            sum += root.val;
            rangeSum(root.right, low, high);
        }
        return sum;
    }
}

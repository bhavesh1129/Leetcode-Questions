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
    int monitor_with_cam, monitor_without_cam, leaf, cameraCount;
    
    public int minCameraCover(TreeNode root) {
        monitor_with_cam = 0;
        monitor_without_cam = -1;
        leaf = 1;
        cameraCount = 0;
        return minCameraCoverR(root) == leaf ? cameraCount + 1 : cameraCount;
    }
    public int minCameraCoverR(TreeNode root) {
        if(root == null){
            return monitor_without_cam;
        }
        int left = minCameraCoverR(root.left);
        int right = minCameraCoverR(root.right);
        
        if(left == leaf || right == leaf){
            cameraCount++;
            return monitor_with_cam;
        }
        if(left == monitor_without_cam && right == monitor_without_cam){
            return leaf;
        }
        return monitor_without_cam;
    }
}

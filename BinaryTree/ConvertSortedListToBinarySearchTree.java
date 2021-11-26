/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        return listToBST(head, null);
    }
    public TreeNode listToBST(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == tail){
            return null;
        }
        while(fast != tail && fast.next != tail){
            slow = slow.next;//mid
            fast = fast.next.next;//last
        }
        TreeNode nn = new TreeNode(slow.val);
        nn.left = listToBST(head, slow);
        nn.right = listToBST(slow.next, tail);
        return nn;
    }
}

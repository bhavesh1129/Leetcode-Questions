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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head, fast = head, n1 = head;
        //finding 1 swap node
        for(int i = 0; i < k - 1; i++){
            fast = fast.next;
            n1 = fast;
        }
        //finding 2 swap node
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        int tempVal = slow.val;
        slow.val = n1.val;
        n1.val = tempVal;
        return head;
    }
}
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
    public ListNode middleNode(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while(runner != null && runner.next != null){
            walker = walker.next;
            runner = runner.next.next;
        }
        return walker;
    }
}

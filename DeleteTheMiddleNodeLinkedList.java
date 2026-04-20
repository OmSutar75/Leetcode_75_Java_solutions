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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
            return null;
    
        
        ListNode curr = head;
        ListNode second = head;
        ListNode prev =null;

        while(second != null && second.next != null)
        {
            prev = curr;
            curr = curr.next;
            second = second.next.next;
        }
        
        prev.next = curr.next;
        return head;
    }
}

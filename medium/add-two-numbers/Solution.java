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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l2.next == null)
            return new ListNode((l1.val + l2.val) % 10, l1.val + l2.val >= 10 ? new ListNode(1) : null);
        if (l1.val + l2.val >= 10){
            if (l1.next != null) l1.next.val++;
            else if (l2.next != null) l2.next.val++;
        }
        return new ListNode((l1.val + l2.val) % 10, 
            addTwoNumbers(l1.next != null ? l1.next : new ListNode(0), l2.next != null ? l2.next : new ListNode(0)));
    }
}
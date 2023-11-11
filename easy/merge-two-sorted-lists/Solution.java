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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // end of both lists
        if (list1 == null && list2 == null)
            return null;
        int val;
        // if end at list 2 or list 1 item is less than list 2 item
        if (list2 == null || (list1 != null && list1.val <= list2.val)){
            val = list1.val;
            list1 = list1.next;
        }
        // list 2 item is smaller
        else {
            val = list2.val;
            list2 = list2.next;
        }
        return new ListNode(val, mergeTwoLists(list1, list2));
    }
}
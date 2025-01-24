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
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                // If list1's value is smaller or equal, add it to the merged list
                current.next = list1;
                list1 = list1.next;
            } else {
                // If list2's value is smaller, add it to the merged list
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If one of the lists is not yet finished, append it to the merged list
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // The first node is the dummy, so return the next node
        return dummy.next;
        
    }
}
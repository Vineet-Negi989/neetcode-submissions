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
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

      
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow.next;
        slow.next = null;

        // Reverse second half
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Merge the two halves
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ListNode nextFirst = first.next;
            ListNode nextSecond = second.next;

            first.next = second;
            second.next = nextFirst;

            first = nextFirst;
            second = nextSecond;
        }
    }
}
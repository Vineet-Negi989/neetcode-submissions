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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // prev is now the head of the reversed list
        head = prev;

    
        if (n == 1) {
            head = head.next;
        } 
        else {
            ListNode temp = head;

            // Move to the node before the node we want to delete
            int i = 1;
            while (i < n - 1) {
                temp = temp.next;
                i++;
            }

            // Remove the nth node
            temp.next = temp.next.next;
        }

        // Reverse the list again
        prev = null;
        current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode beforeReverse = dummy; 
        ListNode current = head;        

        for (int i = 0; i < left - 1; i++) {
            current = current.next;
            beforeReverse = beforeReverse.next;
        }

        ListNode startOfReverse = current; 
        ListNode previous = null;          

        for (int i = 0; i < (right - left) + 1; i++) {
            ListNode nextNode = startOfReverse.next;
            startOfReverse.next = previous;
            previous = startOfReverse;
            startOfReverse = nextNode;
        }
        beforeReverse.next = previous;
        current.next = startOfReverse;

        return dummy.next;
        
    }
}
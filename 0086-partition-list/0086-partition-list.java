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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode high=new ListNode(0);
        
        ListNode smallptr=small;
        ListNode highptr=high;
        
        while(head!=null){
            if(head.val < x){
                smallptr.next=head;
                smallptr=smallptr.next;
            }
            else{
                highptr.next=head;
                highptr=highptr.next;
            }
            head=head.next;
        }
        smallptr.next=high.next;
        highptr.next=null;
        
        return small.next;
    }
}
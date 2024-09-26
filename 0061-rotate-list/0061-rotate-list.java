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
    
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; 
        }
        
        ListNode last=head;
        int n=1;
        
        while(last.next!=null){
            last=last.next;
            n++;
        }
        k=k%n;
        
        if(k==0){
            return head;
        }
      
        last.next=head;
        ListNode newlast=head;
        
        for(int i=1;i<n-k;i++){
            newlast=newlast.next;
        }
        head=newlast.next;
        newlast.next=null;
        
        return head;
    }
}
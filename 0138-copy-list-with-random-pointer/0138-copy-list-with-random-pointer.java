/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node cur=head;
        while(cur!=null){
            Node newone=new Node(cur.val);
            newone.next=cur.next;
            cur.next=newone;
            cur=newone.next;
        }
        
        cur=head;
        while(cur!=null){
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
        
        cur=head;
        Node newhead=head.next;
        Node newcur=newhead;
        while(cur != null){
            cur.next=newcur.next;
            cur=cur.next;
            if(cur!=null){
                newcur.next=cur.next;
                newcur=newcur.next;
            }  
        }
        return newhead;
    }
}
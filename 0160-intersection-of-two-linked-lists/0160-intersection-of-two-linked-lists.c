/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    int lenA=getlength(headA);
    int lenB=getlength(headB);
    while(lenA>lenB){
        lenA--;
        headA=headA->next;
    }
    
    while(lenB>lenA){
        lenB--;
        headB=headB->next;
    }
    
    while(headA!=headB){
        headA=headA->next;
        headB=headB->next;
    }
    return headA;
}

int getlength(struct ListNode*head){
    int len=0;
    while(head!=NULL){
        len++;
        head=head->next;
    }
    return len;
}
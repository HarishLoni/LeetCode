/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if(head==NULL){
        return NULL;
    }
    if(head->next==NULL){
        return head;
    }
    struct ListNode*prev=NULL;
    struct ListNode*current=head;
    while(current!=NULL){
        struct ListNode*nextp=current->next;
        current->next=prev;
        prev=current;
        current=nextp;
    }
    return prev;
    
}
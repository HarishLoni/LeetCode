/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void reorderList(struct ListNode* head){
    if(head==NULL || head->next==NULL){
        return;
    }
    struct ListNode*temp;
     struct ListNode*slow=head;
     struct ListNode*fast=head;
    
    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    
     struct ListNode*prev=NULL;
     struct ListNode*current=slow;
    while(current!=NULL){
        struct ListNode*next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    
    struct ListNode*l1=head;
    struct ListNode*l2=prev;
    while(l2->next!=NULL){
        temp=l1->next;
        l1->next=l2;
        l1=temp;
        
        temp=l2->next;
        l2->next=l1;
        l2=temp;    
    }  
}
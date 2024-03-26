/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode*reverse(struct ListNode*slow){
    struct ListNode*prev=NULL;
    struct ListNode*current=slow;
    struct ListNode*next;
    
    while(current!=NULL){
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    return prev;
}

bool isPalindrome(struct ListNode* head) {
    struct ListNode*slow=head;
    struct ListNode*fast=head;
    
    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    slow=reverse(slow);
    fast=head;
    
    while(slow!=NULL){
        if(fast->val != slow->val){
            return false;
        }
        slow=slow->next;
        fast=fast->next;
    }
    return true;
}
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head==NULL){
        return NULL;
    }
    struct ListNode *prev=head;
    struct ListNode *temp=head->next;
    while(temp!=NULL){
        if(prev->val==temp->val){
            temp=temp->next;
            continue;
        }
        prev->next=temp;
        prev=temp;
        temp=temp->next;
    }
    prev->next=NULL;
    return head;
    
}
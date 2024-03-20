/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode*dummy=(struct ListNode*)malloc(sizeof(struct ListNode));
    dummy->next=head;
    head=dummy;
    struct ListNode*current=dummy;
    while(current->next!=NULL){
        if(current->next->val==val){
            current->next=current->next->next;
        }
        else{
            current=current->next;
        }
        
    }
    return dummy->next;
    
}
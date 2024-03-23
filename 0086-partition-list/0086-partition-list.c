/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* partition(struct ListNode* head, int x) {
    if(head==NULL || head->next==NULL){
        return head;
    }
   
    struct ListNode*left=(struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode*right=(struct ListNode*)malloc(sizeof(struct ListNode));
    left->next=NULL;
    right->next=NULL;
    
    struct ListNode*Lleft=left;
    struct ListNode*Rright=right;
    
    while(head!=NULL){
        if(head->val < x){
            Lleft->next=head;
            Lleft=Lleft->next;
        }
        else{
            Rright->next=head;
            Rright=Rright->next;
        }
        head=head->next;
    }
    
    Lleft->next=right->next;
    Rright->next=NULL;
    
    return left->next;
}
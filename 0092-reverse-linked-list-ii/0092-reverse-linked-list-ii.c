/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
    struct ListNode*dummy=(struct ListNode*)malloc(sizeof(struct ListNode));
    dummy->next=head;
    struct ListNode*leftpre=dummy;
    struct ListNode*current=head;
    struct ListNode*prev=NULL;
    for(int i=1;i<left;i++){
        current=current->next; 
         leftpre=leftpre->next;
    }
    struct ListNode*sublisthead=current;
    int n=right-left+1;
    for(int i=0;i<n;i++){
        struct ListNode*nextn=current->next;
        current->next=prev;
        prev=current;
        current=nextn;
    }
    sublisthead->next=current;
    leftpre->next=prev;
    
    return dummy->next;   
}
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    
    struct ListNode*dummy=(struct ListNode*)malloc(sizeof(struct ListNode));
    dummy->next=head;
    
    struct ListNode*temp1=dummy;
    struct ListNode*temp2=dummy;
    
    for(int i=0;i<n;i++){
        temp2=temp2->next;
    }
    
    while(temp2->next!=NULL){
        temp1=temp1->next;
        temp2=temp2->next;
    }
    
    temp1->next=temp1->next->next;
    
    return dummy->next;  
}
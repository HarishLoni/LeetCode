/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *result=(struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode*temp=result;
    int carry=0;
    
    while(l1!=NULL || l2!=NULL){
        int sum=0+carry;
        if(l1!=NULL){
            sum+=l1->val;
            l1=l1->next;
        }
        
        if(l2!=NULL){
            sum+=l2->val;
            l2=l2->next;
        }
        
        carry=sum/10;
        sum=sum%10;
        temp->next=(struct ListNode*)malloc(sizeof(struct ListNode));
        temp=temp->next;
        temp->val=sum;
        temp->next=NULL;
    }
    
    if(carry==1){
         temp->next=(struct ListNode*)malloc(sizeof(struct ListNode));
        temp=temp->next;
        temp->val=carry;
        temp->next=NULL;    
    }
    
    return result->next;
    
}
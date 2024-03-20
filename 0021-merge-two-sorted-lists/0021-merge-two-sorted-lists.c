/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode*temp1=list1;
    struct ListNode*temp2=list2;
    struct ListNode*result=(struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode*current=result;
    while(temp1!=NULL && temp2!=NULL){
        if(temp1->val <= temp2->val){
            result->next=temp1;
            temp1=temp1->next;
        }
        else{
            result->next=temp2;
            temp2=temp2->next;
        }
        result=result->next;
    }
    if(temp1==NULL){
        result->next=temp2;
    }
    if(temp2==NULL){
        result->next=temp1;
    }
    return current->next;
}
/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     struct Node *next;
 *     struct Node *random;
 * };
 */

void insertbetween(struct Node*head){
    struct Node*temp=head;
    while(temp!=NULL){
        struct Node*n=(struct Node*)malloc(sizeof(struct Node));
        n->val=temp->val;
        n->next=temp->next;
        temp->next=n;
        temp=temp->next->next;
    }
}

void connectrandom(struct Node*head){
    struct Node*temp=head;
    while(temp!=NULL){
        struct Node*copynode=temp->next;
        if(temp->random!=NULL){
        copynode->random=temp->random->next;
        }
        else{
            copynode->random=NULL;
        }
        temp=temp->next->next;
    }
}

struct Node* connectnext(struct Node*head){
    struct Node*temp=head;
    struct Node*dummy=(struct Node*)malloc(sizeof(struct Node));
    dummy->next = NULL;
    struct Node*res=dummy;
    while(temp!=NULL){
        res->next=temp->next;
        temp->next=temp->next->next;
        res=res->next;
        temp=temp->next;
    }
    return dummy->next;
}

struct Node* copyRandomList(struct Node* head) {
    insertbetween(head);
    connectrandom(head);
    return connectnext(head);	
}
struct ListNode* middleNode(struct ListNode* head) {
    if (head == NULL || head->next == NULL) {
        return head;
    }
    
    struct ListNode* slow = head;
    struct ListNode* fast = head->next;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }

    return slow;
}

struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) {
    if (l1 == NULL) {
        return l2;
    }
    if (l2 == NULL) {
        return l1;
    }

    struct ListNode* head = NULL;
    struct ListNode* current = NULL;

    if (l1->val < l2->val) {
        head = l1;
        current = l1;
        l1 = l1->next;
    } else {
        head = l2;
        current = l2;
        l2 = l2->next;
    }

    while (l1 != NULL && l2 != NULL) {
        if (l1->val < l2->val) {
            current->next = l1;
            current = l1;
            l1 = l1->next;
        } else {
            current->next = l2;
            current = l2;
            l2 = l2->next;
        }
    }

    if (l1 != NULL) {
        current->next = l1;
    }
    if (l2 != NULL) {
        current->next = l2;
    }

    return head;
}

struct ListNode* sortList(struct ListNode* head) {
    if (head == NULL || head->next == NULL) {
        return head;
    }

    struct ListNode* mid = middleNode(head);
    struct ListNode* left = head;
    struct ListNode* right = mid->next;
    mid->next = NULL;

    left = sortList(left);
    right = sortList(right);

    return mergeTwoLists(left, right);
}

#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int top;
    int size;
    int *arr;
} Stack;

Stack *stackCreate(int size) {
    Stack *stack = (Stack *) malloc(sizeof(Stack));
    stack->top = -1;
    stack->size = size;
    stack->arr = (int *) malloc(size * sizeof(int));
    return stack;
}

void stackPush(Stack *stack, int x) {
    if (stack->top == stack->size - 1) {
        // The stack is full, so resize it to make it larger
        int new_size = stack->size * 2;
        stack->arr = realloc(stack->arr, new_size * sizeof(int));
        if (stack->arr == NULL) {
            // realloc failed, handle the error
            return;
        }
        stack->size = new_size;
    }
    stack->top++;
    stack->arr[stack->top] = x;
}

int stackPop(Stack *stack) {
    if (stack->top == -1) {
        // The stack is empty, handle the error
        return 0;
    }
    int num = stack->arr[stack->top];
    stack->top--;
    return num;
}

int stackPeek(Stack *stack) {
    if (stack->top == -1) {
        // The stack is empty, handle the error
        return 0;
    }
    return stack->arr[stack->top];
}

bool stackEmpty(Stack *stack) {
    return stack->top == -1;
}

typedef struct {
    Stack *s1;
    Stack *s2;
} MyQueue;

MyQueue *myQueueCreate() {
    MyQueue *queue = (MyQueue *) malloc(sizeof(MyQueue));
    queue->s1 = stackCreate(150);
    queue->s2 = stackCreate(150);
    return queue;
}

void myQueuePush(MyQueue *obj, int x) {
    while (!stackEmpty(obj->s1)) {
        stackPush(obj->s2, stackPop(obj->s1));
    }
    stackPush(obj->s1, x);
    while (!stackEmpty(obj->s2)) {
        stackPush(obj->s1, stackPop(obj->s2));
    }
}

int myQueuePop(MyQueue *obj) {
    if (stackEmpty(obj->s1)) return 0;
    int popVal = stackPop(obj->s1);
    return popVal;
}

int myQueuePeek(MyQueue *obj) {
    if (stackEmpty(obj->s1)) return 0;
    return stackPeek(obj->s1);
}

bool myQueueEmpty(MyQueue *obj) {
    return stackEmpty(obj->s1) && stackEmpty(obj->s2);
}

void myQueueFree(MyQueue *obj) {
    free(obj->s1->arr);
    free(obj->s1);
    free(obj->s2->arr);
    free(obj->s2);
    free(obj);
}

/**
 * Your MyQueue struct will be instantiated and called as such:
 * MyQueue* obj = myQueueCreate();
 * myQueuePush(obj, x);
 * int param_2 = myQueuePop(obj);
 * int param_3 = myQueuePeek(obj);
 * bool param_4 = myQueueEmpty(obj);
 * myQueueFree(obj);
 */
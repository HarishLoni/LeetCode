bool canJump(int* nums, int numsSize) {
    
    int finalposition=numsSize-1;
    int index=numsSize-2;
    
    for(int i=index;i>=0;i--){
        if(i+nums[i]>=finalposition){
            finalposition=i;
        }
    }
    
    return (finalposition==0)? true: false;
    
}
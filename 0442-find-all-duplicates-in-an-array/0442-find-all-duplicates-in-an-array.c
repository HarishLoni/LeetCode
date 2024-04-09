/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDuplicates(int* nums, int numsSize, int* returnSize) {
    
    int *resultset=(int*)malloc(numsSize*sizeof(int));
    int size=0;
    
    for(int i=0;i<numsSize;i++){
        int index=abs(nums[i])-1;
        if(nums[index]<0){
            resultset[size++]=abs(nums[i]);
        }
        nums[index]=-1*nums[index];
    }
    
    *returnSize=size;
    return resultset;
    
}
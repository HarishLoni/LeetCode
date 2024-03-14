int removeDuplicates(int* nums, int numsSize) {
    if(numsSize==0){
        return 0;
    }
    int count=0;
    for(int i=0;i<numsSize;i++){
        if(i<numsSize-1 && nums[i]==nums[i+1]){
            continue;
        }
        else{
            nums[count]=nums[i];
            count++;
        }
    }
    return count;
    
}
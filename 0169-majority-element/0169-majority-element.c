int majorityElement(int* nums, int numsSize) {
    int majority=nums[0];
    int vote=1;
    for(int i=1;i<numsSize;i++){
        if(vote==0){
            vote++;
            majority=nums[i];
        }
        else if(majority==nums[i]){
            vote++;
        }
        else{
            vote--;
        }
    }
    return majority;
    
}
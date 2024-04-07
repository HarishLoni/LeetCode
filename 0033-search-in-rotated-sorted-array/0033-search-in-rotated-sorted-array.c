int modifiedbinarysearch(int nums[],int target,int low,int high){
    if(low>high){
        return -1;
    }
    
    int mid=low+((high-low)/2);
    
    if(nums[mid]==target){
        return mid;
    }
    if(nums[mid]>=nums[low]){
        if(nums[low]<=target && nums[mid]>=target){
            return modifiedbinarysearch(nums,target,low,mid-1);
        }
        else{
            return modifiedbinarysearch(nums,target,mid+1,high);
        }
    }
    else{
        if(nums[mid]<=target && nums[high]>=target){
            return modifiedbinarysearch(nums,target,mid+1,high);
        }
        else{
            return modifiedbinarysearch(nums,target,low,mid-1);
        }
    }
}

int search(int* nums, int numsSize, int target) {
   
    return modifiedbinarysearch(nums,target,0,numsSize-1);
}
void swap(int arr[],int pos1,int pos2){
    int temp;
    temp=arr[pos1];
    arr[pos1]=arr[pos2];
    arr[pos2]=temp;
}

void sortColors(int* nums, int numsSize) {
    int start=0;
    int mid=0;
    int end=numsSize-1;
    while(mid<=end){
        switch(nums[mid]){
            case 0:swap(nums,mid,start);
                   start++;
                   mid++;
                   break;
            
            case 1:mid++;
                   break;
            
            case 2:swap(nums,mid,end);
                  end--;
                  break;
                
            default:printf("enter correct values");
                   break;
        
        }
    }
    
}

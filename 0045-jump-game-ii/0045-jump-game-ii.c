int jump(int* nums, int numsSize) {
    
    if(numsSize==1){
        return 0;
    }
    
    int destination=numsSize-1;
    int coverage=0;
    int lastjumpindex=0;
    int totaljumps=0;
    
    for(int i=0;i<numsSize;i++){
        coverage=coverage>(i+nums[i])?coverage:(i+nums[i]);
        if(i==lastjumpindex){
            lastjumpindex=coverage;
            totaljumps++;
        
            if(coverage>=destination){
                 return totaljumps;
            }
        }
    }
    return totaljumps;
}
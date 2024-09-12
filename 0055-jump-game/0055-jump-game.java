class Solution {
    public boolean canJump(int[] nums) {
        // int maxfind=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i>maxfind){
        //         return false;
        //     }
        //     maxfind=Math.max(maxfind,i+nums[i]);
        // }
        // return true;
        
        
        int max=0;
        int n=nums.length;
        
        if(n==1){
            return true;
        }
        for(int i=0;i<nums.length-1 && max>=i ;i++){
            max=Math.max(max,i+nums[i]);
            if(max>=n-1){
                return true;
            }
        }
        return false;
    }
}
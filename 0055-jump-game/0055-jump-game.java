class Solution {
    public boolean canJump(int[] nums) {
        int maxfind=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxfind){
                return false;
            }
            maxfind=Math.max(maxfind,i+nums[i]);
        }
        return true;
    }
}
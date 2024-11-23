class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res=Math.max(sum,res);
            if(sum<0){
                sum=0;
            }
        }
        return res;
    }
}
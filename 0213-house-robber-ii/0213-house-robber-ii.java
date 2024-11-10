class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        
        int[] arr1=new int[n-1];
        int[] arr2=new int[n-1];
        
        for(int i=0;i<n-1;i++){
            arr1[i]=nums[i];
            arr2[i]=nums[i+1];
        }
        
        int res1=helper(arr1);
        int res2=helper(arr2);
        
        return Math.max(res1,res2);
        
    }
    
    public static int helper(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1){
                take+=dp[i-2];
            }
            int nottake=0+dp[i-1];
            dp[i]=Math.max(take,nottake);
        }
        
        return dp[n-1];
        
    }
}
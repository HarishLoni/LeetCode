class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        if(nums==null || nums.length<4){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[right]+(long)nums[left];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[right],nums[left]));
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
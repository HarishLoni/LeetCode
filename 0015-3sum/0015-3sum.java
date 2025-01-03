class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        ArrayList<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>left && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
}
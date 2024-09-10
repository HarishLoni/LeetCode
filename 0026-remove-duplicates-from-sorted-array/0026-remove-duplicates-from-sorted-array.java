class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0 ){
            return 0;
        }
       int rd=1;
        for(int i=1;i<nums.length;i++){
            if(nums[rd-1] != nums[i]){
                nums[rd]=nums[i];
                rd++;
            }
        }
        return rd;
    }
}
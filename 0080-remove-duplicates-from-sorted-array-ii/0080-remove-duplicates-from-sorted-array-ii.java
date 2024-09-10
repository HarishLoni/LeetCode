class Solution {
    public int removeDuplicates(int[] nums) {
        int rd=2;
        for(int i=2;i<nums.length;i++){
            if(nums[rd-2] != nums[i]){
                nums[rd]=nums[i];
                rd++;
            }
        }
        return rd;
    }
}
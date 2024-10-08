class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                al.add(Math.abs(nums[i]));
            }
            else{
                nums[index]=-1*nums[index];
            }
        }
        return al;
    }
}
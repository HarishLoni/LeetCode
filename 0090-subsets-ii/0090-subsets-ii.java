class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,res,temp,0);
        
        return res;
    }
    
    public static void solve(int[] nums,List<List<Integer>> res,List<Integer> temp,int i){
        if(res.contains(temp)){
            return;
        }
        res.add(new ArrayList<>(temp));
        
        for(int j=i;j<nums.length;j++){
            temp.add(nums[j]);
            solve(nums,res,temp,j+1);
            temp.remove(temp.size()-1);
        }
    }
}
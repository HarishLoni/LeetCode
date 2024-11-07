class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        
        solve(nums,res,temp);
        
        return res;
    }
    
    public static void solve(int[] nums,List<List<Integer>> res,List<Integer> temp){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int j=0;j<nums.length;j++){
                if(temp.contains(nums[j])){
                    continue;
                }
                temp.add(nums[j]);
                solve(nums,res,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
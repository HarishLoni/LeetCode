class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        
        solve(candidates,target,res,temp,0);
        
        return res;
    }
    
    public static void solve(int[] candidates,int target,List<List<Integer>> res,List<Integer> temp,int ind){
            if(target==0){
                res.add(new ArrayList<>(temp));
                return;
            }
            
        
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            temp.add(candidates[i]);
            solve(candidates,target-candidates[i],res,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
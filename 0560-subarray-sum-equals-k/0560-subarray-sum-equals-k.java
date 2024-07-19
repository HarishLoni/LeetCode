class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        int res=0;
        int presum=0;
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            presum+=nums[i];
            if(map.containsKey(presum-k)){
                res+=map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        
        return res;
    }
}
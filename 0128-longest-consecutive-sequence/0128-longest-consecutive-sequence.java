class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            if(!set.contains(i-1)){
                int cur=i+1;
                while(set.contains(cur)){
                    cur=cur+1;
                }
                int last=cur-1;
                ans=Math.max(ans,last-i+1);
            }
        }
        return ans;
    }
}
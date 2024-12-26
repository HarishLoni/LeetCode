class Solution {
    public int majorityElement(int[] nums) {
        // int n=(nums.length)/2;
        // Arrays.sort(nums);
        // return nums[n];
        
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int m=(nums.length)/2;
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i],map.get(nums[i])+1);
//             }
//             else{
//                 map.put(nums[i],1);
//             }
//         }
        
//         for(int k:map.keySet()){
//             if(map.get(k)>m){
//                 return k;
//             }
//         }
//         return 0;
        
        int n=nums.length;
        int ele=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}
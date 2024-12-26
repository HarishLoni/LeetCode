class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count1=0;
        int count2=0;
        int ele1=0;
        int ele2=0;
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0 && nums[i]!=ele1){
                count2=1;
                ele2=nums[i];
            }
            else if(nums[i]==ele1){
                count1++;
            }
            else if(nums[i]==ele2){
                count2++;
            }
            else{
                count1--;count2--;
            }
        }
        
        count1=0;
        count2=0;
        int m=n/3;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                count1++;
            }
            else if(nums[i]==ele2){
                count2++;
            }
        }
        if(count1>m){
            list.add(ele1);
        }
        if(count2>m){
            list.add(ele2);
        }
        return list;
    }
}
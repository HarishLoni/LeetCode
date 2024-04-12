class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        if(nums1.length==0 || nums2.length==0){
            return new int[0];
        }
        
        HashMap<Integer,Integer> hash=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        
        stack.push(nums2[nums2.length-1]);
        hash.put(nums2[nums2.length-1],-1);
        
        for(int i=nums2.length-2 ;i>=0 ;i--){
            
            if(nums2[i]<stack.peek()){
                hash.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
                continue;
             }
            
                while(!stack.isEmpty() && stack.peek()<nums2[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.push(nums2[i]);
                    hash.put(nums2[i],-1);
                }
                else{
                    hash.put(nums2[i],stack.peek());
                    stack.push(nums2[i]);
                 }
            }
        
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hash.get(nums1[i]);
        }
        
        return nums1;
    }
}
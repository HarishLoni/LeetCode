class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n=temperatures.length;
        Stack<Integer> stack=new Stack<>();
        int[] arr=new int[n];
        
        for(int idx=n-1;idx>=0;idx--){
            while(!stack.isEmpty() && temperatures[idx]>=temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                arr[idx]=stack.peek()-idx;
            }
            stack.push(idx);
             }
        return arr;
    }
}
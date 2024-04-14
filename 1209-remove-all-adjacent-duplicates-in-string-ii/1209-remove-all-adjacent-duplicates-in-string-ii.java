class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()[0]==c){
                stack.peek()[1]++;
            }
            else{
                stack.push(new int[]{c,1});
            }
            if(stack.peek()[1]==k){
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            int[] top=stack.pop();
            while(top[1]>0){
                sb.append((char) top[0]);
                top[1]--;
            }
        }
        return sb.reverse().toString();
    }
}
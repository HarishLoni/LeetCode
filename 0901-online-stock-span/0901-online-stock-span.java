class StockSpanner {
    private List<Integer> list;

    public StockSpanner() {
        this.list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        int count=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)>price){
                break;
            }
            count++;
        }
        return count;
    }
    
    public int[] calculatespan(int[] prices){
        int n=prices.length;
        int[] arr=new int[n];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int idx=1;idx<n;idx++){
            while(!stack.isEmpty() && prices[stack.peek()]<prices[idx]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[idx]=idx+1;
            }
            else{
                arr[idx]=idx-stack.peek();
            }
            stack.push(idx);
        }
        return arr;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
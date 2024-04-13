class StockSpanner {
    Stack<Integer> stack;
    List<Integer> list;

    public StockSpanner() {
        stack=new Stack<>();
        list=new ArrayList<>();
    }

    public int next(int price) {
        list.add(price);
        while(!stack.isEmpty() && list.get(stack.peek())<=price){
            stack.pop();
        }
        int previousgreaterindex=(stack.isEmpty())?-1:stack.peek();
        int currentindex=list.size()-1;
        int ans= currentindex-previousgreaterindex;
        stack.push(currentindex);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
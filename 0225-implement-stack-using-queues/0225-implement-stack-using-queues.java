class MyStack {
    Queue<Integer> queue;
    
    public MyStack() {
        queue=new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
        for(int i=1;i<queue.size();i++){
            queue.add(queue.remove());
        }
    }
    
    public int pop() {
        if(queue.isEmpty()){
            return -1;
        }
        return queue.remove();
    }
    
    public int top() {
        if(queue.isEmpty()){
            return -1;
        }
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/*

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
      
    public MyStack() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }
    
    public void push(int x) {
       queue1.add(x);
    }
    
    public int pop() {
       for(int i=1;i<queue1.size();i++){
           queue2.add(queue1.remove());
       }
       int a=queue1.remove();
       while(!queue2.isEmpty){
            queue1.add(queue.remove());
       }
       return a;
    }
    
    public int top() {
       for(int i=1;i<queue1.size();i++){
           queue2.add(queue1.remove());
       }
       int a=queue1.peek();
       queue2.add(queue1.remove());
       while(!queue2.isEmpty()){
            queue1.add(queue2.remove());
       }
       return a;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}


*/
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
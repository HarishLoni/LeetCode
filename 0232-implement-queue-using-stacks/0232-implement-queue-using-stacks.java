import java.util.Stack;

public class MyQueue {
    
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        if (s1.empty()) return 0;
        int popVal = s1.pop();
        return popVal;
    }

    public int peek() {
        if (s1.empty()) return 0;
        return s1.peek();
    }

    public boolean empty() {
        return s1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
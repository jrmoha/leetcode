class MyQueue {

    private final Stack<Integer> stk;
    public MyQueue() {
        stk = new Stack<>();

    }

    public void push(int x) {
        stk.push(x);
    }

    public int pop() {
        Stack<Integer> s=new Stack<>();
        while(!stk.isEmpty()){
            s.push(stk.pop());
        }
        int pop=s.pop();
        while(!s.isEmpty()){
            stk.push(s.pop());
        }
        return pop;
    }

    public int peek() {
        Stack<Integer> s=new Stack<>();
        while(!stk.isEmpty()){
            s.push(stk.pop());
        }
        int peek=s.peek();
        while(!s.isEmpty()){
            stk.push(s.pop());
        }
        return peek;
    }

    public boolean empty() {
        return stk.isEmpty();
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
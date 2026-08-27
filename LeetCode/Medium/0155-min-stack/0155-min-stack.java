class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minstack;
    public MinStack() {
        stack = new Stack<Integer>();
        minstack = new Stack<Integer>();
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(value);
            minstack.push(value);
            return;
        }

        stack.push(value);
        if(value <= minstack.peek()){
            minstack.push(value);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int val = stack.pop();
        if(val == minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        if(stack.isEmpty()){
        return -1;
        }
        return stack.peek();
    }
    
    public int getMin() {
        if(stack.isEmpty()){
            return -1;
        }

        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */